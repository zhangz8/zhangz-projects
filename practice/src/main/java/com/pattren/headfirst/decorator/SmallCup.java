package com.pattren.headfirst.decorator;

public class SmallCup extends CupDecorator {

	private Beverage beverage;

	public SmallCup(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", small cup";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0;
	}

}
