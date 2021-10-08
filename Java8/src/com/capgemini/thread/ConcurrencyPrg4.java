package com.capgemini.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConcurrencyPrg4 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		 Callable<String> callable1=()->	  "program1";
		 Callable<String> callable2=()->	  "program2";
		 Callable<String> callable3=()->	  "program3";
		 Callable<String> callable4=()->	  "program4";
		
		 ExecutorService service=Executors.newFixedThreadPool(10);
		 Future<String> submit1 = service.submit(callable1);
		 Future<String> submit2 = service.submit(callable2);
		 Future<String> submit3 = service.submit(callable3);
		 Future<String> submit4 = service.submit(callable4);
		 
		 //submit1.cancel(true);
		 System.out.println(submit1.get());
		 System.out.println(submit2.get());
		 System.out.println(submit3.get());
		 System.out.println(submit4.get());
		 
		 
		 
	}
}
