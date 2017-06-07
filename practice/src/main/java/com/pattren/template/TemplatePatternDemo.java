package com.pattren.template;

/**
 * ��ģ��ģʽ��Template Pattern���У�һ�������๫��������ִ�����ķ����ķ�ʽ/ģ�塣<br>
 * ����������԰���Ҫ��д����ʵ�֣������ý��Գ������ж���ķ�ʽ���� ��
 * */
public class TemplatePatternDemo {
	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}
}