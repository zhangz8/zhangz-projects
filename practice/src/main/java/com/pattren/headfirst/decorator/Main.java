package com.pattren.headfirst.decorator;

public class Main {

	public static void main(String[] args) {
		Beverage houseBlend = new HouseBlend();

		houseBlend = new Milk(houseBlend);// ��milk

		houseBlend = new Mocha(houseBlend);// ��mocha
		houseBlend = new Mocha(houseBlend);// ��mocha
		houseBlend = new MiddleCup(houseBlend);// ��mocha

		System.out.println(houseBlend.getDescription());
		System.out.println(houseBlend.cost());

	}

}
