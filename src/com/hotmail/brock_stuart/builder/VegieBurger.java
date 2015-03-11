package com.hotmail.brock_stuart.builder;

public class VegieBurger extends Burger {
	
	@Override
	public float price() {
		return 3.99f;
	}
	
	@Override
	public String name() {
		return "Vegie Burger";
	}

}
