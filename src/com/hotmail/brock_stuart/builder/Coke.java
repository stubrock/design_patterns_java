package com.hotmail.brock_stuart.builder;

public class Coke extends ColdDrink {
	
	@Override
	public float price() {
		return 1.99f;
	}
	
	@Override
	public String name() {
		return "Coke";
	}

}
