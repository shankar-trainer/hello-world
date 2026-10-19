package com.productservice.util;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DefaultSubscriber implements Subscriber<Object> {

	private String name = "";

	public DefaultSubscriber(String name) {
		this.name = name + " - ";
	}

	public DefaultSubscriber() {
	}

	@Override
	public void onSubscribe(Subscription subscription) {
		subscription.request(Long.MAX_VALUE);
	}

	@Override
	public void onNext(Object o) {
		log.info(name + "Received: {}", o);
	}

	@Override
	public void onError(Throwable throwable) {
		log.error(name + "Error: {}", throwable.getMessage());
	}

	@Override
	public void onComplete() {
		log.info(name + "Completed");
	}
}
