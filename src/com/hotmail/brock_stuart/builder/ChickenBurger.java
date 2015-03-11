package com.hotmail.brock_stuart.builder;

public class ChickenBurger extends Burger {
	
	@Override
	public float price() {
		return 2.99f;
	}
	
	@Override
	public String name() {
		return "Chicken Burger";
	}

}
