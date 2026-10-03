package com.productservice.util;

import java.util.function.Consumer;

import org.reactivestreams.Subscriber;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SubscribeUtil {

	public static Consumer<Object> onNext() {
		return o -> log.info("Received: {}", o);
	}

	public static Consumer<Throwable> onError() {
		return e -> log.error("Error: {}", e.getMessage());
	}

	public static Runnable onComplete() {
		return () -> log.info("Completed");
	}

	public static Subscriber<Object> subscriber() {
		return new DefaultSubscriber();
	}

	public static Subscriber<Object> subscriber(String name) {
		return new DefaultSubscriber(name);
	}

}
