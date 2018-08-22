package com.pattren.headfirst.factory.abstract0.ingrendent;

public class Main {

	public static void main(String[] args) {
		PizzaStore pizzaStore = new HangzhouPizzaStore();
		pizzaStore.order("veggie");
		pizzaStore.order("cheese");
		CheeseAndDough cad = new CheeseAndDough();
		System.out.println(cad.getName());
		System.out.println(cad.getName0());
	}

}
