package com.pattren.singleton.inner_class;

public class Singleton6 {
	private static class SingletonHolder {
		private static final Singleton6 INSTANCE = new Singleton6();
	}

	private Singleton6() {
	}

	public static final Singleton6 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
