package com.hotmail.brock_stuart.builder;

public class Pepsi extends ColdDrink {
	
	@Override
	public float price() {
		return 1.99f;
	}
	
	@Override
	public String name() {
		return "Pepsi";
	}

}
