package com.pattren.headfirst.factory.method;

public abstract class PizzaStore {

	public void order(String name) {
		Pizza pizza = create(name);
		pizza.bake();
		pizza.cut();
		pizza.box();
	}

	protected abstract Pizza create(String name);
}
