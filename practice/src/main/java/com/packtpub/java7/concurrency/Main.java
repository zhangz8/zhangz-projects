package com.packtpub.java7.concurrency;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Main {

	private static boolean isStop;

	public static void main(String[] args) throws InterruptedException {

		// Thread t = new Thread(new Runnable() {
		// @Override
		// public void run() {
		//
		// while (!isStop) {
		// try {
		// TimeUnit.SECONDS.sleep(1);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// System.out.println(Thread.currentThread().getName() + "...");
		// }
		// }
		// }, "t");
		//
		// t.start();
		// TimeUnit.SECONDS.sleep(3);
		// isStop = true;
		List<String> uuids = new LinkedList<String>();
		for (int i = 200; i >= 0; i--) {
			System.out.println(UUID.randomUUID().toString().replaceAll("-", "")
					.toUpperCase());
		}
	}
}
