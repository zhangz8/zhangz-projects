package com.pattren.headfirst.factory.method;

import com.pattren.headfirst.factory.method.hangzhou.HangzhouPizzaStore;
import com.pattren.headfirst.factory.method.xingyang.XingyangPizzaStore;

public class Main {

	public static void main(String[] args) {
		PizzaStore xingyangStore = new XingyangPizzaStore();
		xingyangStore.order("meet");
		xingyangStore.order("vegan");

		PizzaStore hangzhouStore = new HangzhouPizzaStore();
		hangzhouStore.order("meet");
		hangzhouStore.order("vegan");
	}

}
