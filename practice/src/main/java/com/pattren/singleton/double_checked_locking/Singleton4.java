package com.pattren.singleton.double_checked_locking;

/**
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。 getInstance() 的性能对应用程序很关键。
 * */
public class Singleton4 {

	private volatile static Singleton4 singleton;

	private Singleton4() {
	}

	public static Singleton4 getInstance() {
		if (singleton == null) {
			synchronized (Singleton4.class) {
				if (singleton == null) {
					singleton = new Singleton4();
				}
			}
		}
		return singleton;
	}

}
