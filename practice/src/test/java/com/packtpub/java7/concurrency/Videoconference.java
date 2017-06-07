package com.packtpub.java7.concurrency;

import java.util.concurrent.CountDownLatch;

public class Videoconference implements Runnable {

	private CountDownLatch countDownLatch;

	public Videoconference(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		System.out.printf("VideoConference: Initialization: %d participants.\n", countDownLatch.getCount());
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("playing...");
	}

	public void arrive(String userName) {
		System.out.println(userName + "has arrived.");
		countDownLatch.countDown();
	}

}
