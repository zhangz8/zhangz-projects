package com.pattren.headfirst.factory.abstract0.ingrendent;

public interface PizzaIngredentFactory {

	Cheese createCheese();

	Veggies[] createVeggies();

	Dough createDough();
}
