package com.pattren.singleton.double_checked_locking;

/**
 * ���������ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ����ܡ� getInstance() �����ܶ�Ӧ�ó���ܹؼ���
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
