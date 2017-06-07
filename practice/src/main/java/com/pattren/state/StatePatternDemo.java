package com.pattren.state;

/**
 * ��״̬ģʽ��State Pattern���У������Ϊ�ǻ�������״̬�ı�ġ�<br>
 * ��״̬ģʽ�У����Ǵ�����ʾ����״̬�Ķ����һ����Ϊ����״̬����ı���ı�� context ����
 * */
public class StatePatternDemo {
	public static void main(String[] args) {
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);

		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);

		System.out.println(context.getState().toString());
	}
}