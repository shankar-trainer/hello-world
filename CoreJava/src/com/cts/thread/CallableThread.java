package com.cts.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThread implements Callable<String> {

	@Override
	public String call() throws Exception {
		return "thread program";
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newSingleThreadScheduledExecutor();
		Future<String> submit = service.submit(new CallableThread());

		System.out.println(submit.get());

	}

}
