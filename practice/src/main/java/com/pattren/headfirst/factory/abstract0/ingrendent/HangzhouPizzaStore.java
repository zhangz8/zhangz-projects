package com.pattren.headfirst.factory.abstract0.ingrendent;

public class HangzhouPizzaStore extends PizzaStore {

	private PizzaIngredentFactory pizzaIngredentFactory = new HangzhouPizzaIngredentFactory();

	@Override
	public Pizza create(String name) {
		if ("cheese".equalsIgnoreCase(name)) {
			return new CheesePizza(pizzaIngredentFactory);
		}
		if ("veggie".equalsIgnoreCase(name)) {
			return new VeggiePizza(pizzaIngredentFactory);
		}
		return null;
	}

}
