package com.pattren.singleton.ehan;

/**
 * 描述：这种方式比较常用，但容易产生垃圾对象。<br>
 * 优点：没有加锁，执行效率会提高。 <br>
 * 缺点：类加载时就初始化，浪费内存。
 * */
public class Singleton3 {

	private static Singleton3 singleton = new Singleton3();

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		return singleton;
	}

}
