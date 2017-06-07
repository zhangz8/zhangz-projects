package com.packtpub.java7.concurrency;

public class CountDownLantchTest {
	private static int ROW = 100;
	private static int COL = 100;

	public static void main(String[] agrs) {
		DataCenter dataCenter = new DataCenter(ROW, COL);
		int[][] data = dataCenter.getData();
		Thread[] threads = new Thread[ROW];
		for (int i = 0; i < ROW; i++) {
			threads[i] = new Thread(new SuShuTask(data[i]), "[thread:" + i + "]");
			threads[i].start();
		}
	}

	// public static void main(String[] agrs) {
	// CountDownLatch c = new CountDownLatch(10);
	// Videoconference v = new Videoconference(c);
	// Thread vThread = new Thread(v);
	// vThread.start();
	//
	// for (int i = 0; i < 10; i++) {
	// Partcipant p = new Partcipant(v, "user:" + i);
	// Thread pThread = new Thread(p);
	// pThread.start();
	// }
	// }

}
