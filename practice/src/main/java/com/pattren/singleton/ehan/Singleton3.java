package com.pattren.singleton.ehan;

/**
 * ���������ַ�ʽ�Ƚϳ��ã������ײ�����������<br>
 * �ŵ㣺û�м�����ִ��Ч�ʻ���ߡ� <br>
 * ȱ�㣺�����ʱ�ͳ�ʼ�����˷��ڴ档
 * */
public class Singleton3 {

	private static Singleton3 singleton = new Singleton3();

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		return singleton;
	}

}
