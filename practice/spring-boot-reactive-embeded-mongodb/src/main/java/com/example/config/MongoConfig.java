package com.example.config;

import de.flapdoodle.embed.mongo.distribution.Version;
import de.flapdoodle.embed.mongo.transitions.Mongod;
import de.flapdoodle.embed.mongo.transitions.RunningMongodProcess;
import de.flapdoodle.reverse.TransitionWalker;

import de.flapdoodle.embed.mongo.config.Net;

import de.flapdoodle.reverse.TransitionWalker;
import de.flapdoodle.reverse.transitions.Start;

import org.springframework.context.annotation.Configuration;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextClosedEvent;


@Configuration
public class MongoConfig  implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    private TransitionWalker.ReachedState<RunningMongodProcess> runningMongo;

//     @Override
//     public void initialize(ConfigurableApplicationContext applicationContext) {
//         // 1. Force the embedded instance to boot before any beans are created
//         if (runningMongo == null) {
//             System.out.println(">>> Starting Embedded MongoDB cleanly before Spring Context init...");
//             runningMongo = Mongod.instance().start(Version.Main.V7_0);
//         }


// // 2. Register a teardown hook to shut down gracefully when the context closes
//         applicationContext.addApplicationListener(event -> {
//             if (event instanceof ContextClosedEvent) {
//                 if (runningMongo != null) {
//                     System.out.println(">>> Shutting down Embedded MongoDB...");
//                     runningMongo.close();
//                     runningMongo = null;
//                 }
//             }
//         });
//        }


    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        if (runningMongo == null) {
            System.out.println(">>> Starting Embedded MongoDB bound directly to IPv4 (127.0.0.1)...");
            
            // Override the default Flapdoodle network transition to bind explicitly to 127.0.0.1 on port 27017
            Mongod mongodCustomConfig = Mongod.builder()
                    .net(Start.to(Net.class).initializedWith(Net.of("127.0.0.1", 27017, false)))
                    .build();

            runningMongo = mongodCustomConfig.start(Version.Main.V7_0);
        }

        applicationContext.addApplicationListener(event -> {
            if (event instanceof ContextClosedEvent) {
                if (runningMongo != null) {
                    System.out.println(">>> Shutting down Embedded MongoDB...");
                    runningMongo.close();
                    runningMongo = null;
                }
            }
        });
    }

    @PostConstruct
    public void startEmbeddedMongo() {
        // Automatically downloads and provisions MongoDB v6.0 or v7.0 locally
        this.runningMongo = Mongod.instance()
                .start(Version.Main.V6_0);
    }

    @PreDestroy
    public void stopEmbeddedMongo() {
        if (this.runningMongo != null) {
            this.runningMongo.close();
        }
    }
}
