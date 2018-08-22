package com.pattren.headfirst.factory.abstract0.ingrendent;

import com.pattren.headfirst.factory.abstract0.ingrendent.impl.CheeseImpl;
import com.pattren.headfirst.factory.abstract0.ingrendent.impl.Doufu;
import com.pattren.headfirst.factory.abstract0.ingrendent.impl.DoughImpl;

public class HangzhouPizzaIngredentFactory implements PizzaIngredentFactory {

	@Override
	public Cheese createCheese() {
		return new CheeseImpl();
	}

	@Override
	public Veggies[] createVeggies() {
		return new Veggies[] { new Doufu() };
	}

	@Override
	public Dough createDough() {
		return new DoughImpl();
	}

}
