package com.pattren.headfirst.factory.abstract0.ingrendent;

public abstract class Pizza {

	String name;
	Dough dough;
	Cheese cheese;
	Veggies[] veggies;

	public abstract void prepare();

	public String toString() {
		String veggiesStr = "";
		for (Veggies item : veggies) {
			veggiesStr += item.getName() + ", ";
		}
		return name + ", " + dough.getName() + ", " + cheese.getName0() + ", "
				+ veggiesStr;
	}
}
