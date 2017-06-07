package com.pattren.null_object;

public class NullCustomer extends AbstractCustomer {

	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}

	@Override
	public boolean isNil() {
		return true;
	}
}