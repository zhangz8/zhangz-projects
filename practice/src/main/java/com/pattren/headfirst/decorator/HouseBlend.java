package com.pattren.headfirst.decorator;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		this.description = "HouseBlend Coffe";
	}

	@Override
	public double cost() {
		return 3;
	}

}
