package com.hotmail.brock_stuart.builder;

public class ColdDrink implements Item {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Soda Water";
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0.99f;
	}

}
