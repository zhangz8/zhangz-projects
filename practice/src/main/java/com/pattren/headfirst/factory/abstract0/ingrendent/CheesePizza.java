package com.pattren.headfirst.factory.abstract0.ingrendent;

public class CheesePizza extends Pizza {

	private PizzaIngredentFactory pizzaIngredentFactory;

	public CheesePizza(PizzaIngredentFactory pizzaIngredentFactory) {
		this.name = "cheese pizza";
		this.pizzaIngredentFactory = pizzaIngredentFactory;
	}

	@Override
	public void prepare() {
		this.cheese = pizzaIngredentFactory.createCheese();
		this.dough = pizzaIngredentFactory.createDough();
		this.veggies = pizzaIngredentFactory.createVeggies();
	}

}
