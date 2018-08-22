package com.pattren.headfirst.factory.method.hangzhou;

import com.pattren.headfirst.factory.method.Pizza;
import com.pattren.headfirst.factory.method.PizzaStore;

public class HangzhouPizzaStore extends PizzaStore {

	@Override
	public Pizza create(String name) {
		if ("meet".equalsIgnoreCase(name)) {
			return new HangzhouMeetPizza();
		}
		if ("vegan".equalsIgnoreCase(name)) {
			return new HangzhouVeganPizza();
		}
		return null;
	}

}
