package com.phei.netty.aio;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Main {

	public static void main(String[] args) throws Exception {

		FutureTask<String> future1 = new FutureTask(new Callable() {
			public String call() {
				return "helloworld";
			}
		});
		FutureTask<String> future2 = new FutureTask(new Callable() {
			public String call() {
				return "helloworld2";
			}
		});

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		future1.cancel(false);
		try {
			executorService.submit(future1);
		} catch (Exception e) {
			System.out.println("future1 occur exception");
		}
		executorService.submit(future2);
		executorService.shutdown();
		;

		try {

			System.out.println(future1.get());
		} catch (Exception e) {
			System.out.println("get an occur exception task");
		}
		System.out.println(future2.get());
	}
}
