package com.pattren.headfirst.factory.method.xingyang;

import com.pattren.headfirst.factory.method.Pizza;
import com.pattren.headfirst.factory.method.PizzaStore;

public class XingyangPizzaStore extends PizzaStore {

	@Override
	public Pizza create(String name) {
		if ("meet".equalsIgnoreCase(name)) {
			return new XingyangMeetPizza();
		}
		if ("vegan".equalsIgnoreCase(name)) {
			return new XingyangVeganPizza();
		}
		return null;
	}

}
