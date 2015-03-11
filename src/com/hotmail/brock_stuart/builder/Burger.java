package com.hotmail.brock_stuart.builder;

public class Burger implements Item {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Plain";
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 1.99f;
	}

}
