package com.packtpub.java7.concurrency;

import java.util.concurrent.TimeUnit;

public class Partcipant implements Runnable {

	private Videoconference videoconference;
	private String userName;

	public Partcipant(Videoconference videoconference, String userName) {
		this.videoconference = videoconference;
		this.userName = userName;
	}

	@Override
	public void run() {
		Long duration = (long) (Math.random() * 10);
		try {
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		videoconference.arrive(userName);
	}

}
