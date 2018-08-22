package com.pattren.headfirst.factory.abstract0.ingrendent;

public class VeggiePizza extends Pizza {

	private PizzaIngredentFactory pizzaIngredentFactory;

	public VeggiePizza(PizzaIngredentFactory pizzaIngredentFactory) {
		this.name = "veggie pizza";
		this.pizzaIngredentFactory = pizzaIngredentFactory;
	}

	@Override
	public void prepare() {
		this.cheese = pizzaIngredentFactory.createCheese();
		this.dough = pizzaIngredentFactory.createDough();
		this.veggies = pizzaIngredentFactory.createVeggies();
	}

}
