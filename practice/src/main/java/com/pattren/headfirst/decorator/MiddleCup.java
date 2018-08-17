package com.pattren.headfirst.decorator;

public class MiddleCup extends CupDecorator {

	private Beverage beverage;

	public MiddleCup(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", middle cup";
	}

	@Override
	public double cost() {
		return beverage.cost() + 2;
	}

}
