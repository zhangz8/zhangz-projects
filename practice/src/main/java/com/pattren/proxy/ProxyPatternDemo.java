package com.pattren.proxy;

/**
 * �ڴ���ģʽ��Proxy Pattern���У�һ���������һ����Ĺ��ܡ�<br>
 * �ڴ���ģʽ�У����Ǵ����������ж���Ķ����Ա�������ṩ���ܽӿڡ�
 * */
public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		// ͼ�񽫴Ӵ��̼���
		image.display();
		System.out.println("");
		// ͼ���޷��Ӵ��̼���
		image.display();
	}
}