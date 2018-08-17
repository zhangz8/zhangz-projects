package com.pattren.headfirst.decorator;

public class Main {

	public static void main(String[] args) {
		Beverage houseBlend = new HouseBlend();

		houseBlend = new Milk(houseBlend);// 加milk

		houseBlend = new Mocha(houseBlend);// 加mocha
		houseBlend = new Mocha(houseBlend);// 加mocha
		houseBlend = new MiddleCup(houseBlend);// 加mocha

		System.out.println(houseBlend.getDescription());
		System.out.println(houseBlend.cost());

	}

}
