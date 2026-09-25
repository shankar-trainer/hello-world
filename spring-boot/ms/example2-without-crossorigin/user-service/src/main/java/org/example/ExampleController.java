package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @GetMapping
    public String getExample() {
        return "Hello from Example Service!";  // Response to GET requests
    }
//
//    @GetMapping("/example")
//    public Mono<String> example() {
//        return Mono.just("ok");
//    }

}

