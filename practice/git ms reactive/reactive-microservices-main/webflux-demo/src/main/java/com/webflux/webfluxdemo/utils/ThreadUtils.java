package com.webflux.webfluxdemo.utils;

public class ThreadUtils {

	public static void sleepSeconds(Integer seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
