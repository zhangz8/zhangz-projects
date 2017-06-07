package com.pattren.facade;

/**
 * ���ģʽ��Facade Pattern������ϵͳ�ĸ����ԣ�����ͻ����ṩ��һ���ͻ��˿��Է���ϵͳ�Ľӿڣ�<br>
 * �������е�ϵͳ���һ���ӿ� ��������ϵͳ�ĸ����ԡ�
 */
public class FacadePatternDemo {
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}