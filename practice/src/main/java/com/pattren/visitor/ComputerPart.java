package com.pattren.visitor;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}