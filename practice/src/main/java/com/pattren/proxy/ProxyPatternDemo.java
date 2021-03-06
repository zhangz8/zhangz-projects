package com.pattren.proxy;

/**
 * 在代理模式（Proxy Pattern）中，一个类代表另一个类的功能。<br>
 * 在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。
 * */
public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		// 图像将从磁盘加载
		image.display();
		System.out.println("");
		// 图像将无法从磁盘加载
		image.display();
	}
}