package com.packtpub.java7.concurrency;

import java.util.concurrent.TimeUnit;

public class SuShuTask implements Runnable {

	private int[] data;

	public SuShuTask(int[] data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (int i : data) {
			System.out.println(Thread.currentThread().getName() + "Êý:" + i);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
