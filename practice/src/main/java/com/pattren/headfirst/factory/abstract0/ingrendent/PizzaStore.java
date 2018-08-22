package com.pattren.headfirst.factory.abstract0.ingrendent;

public abstract class PizzaStore {

	public void order(String name) {
		Pizza pizza = create(name);
		pizza.prepare();
		System.out.println(pizza.toString());
	}

	protected abstract Pizza create(String name);
}
