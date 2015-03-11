package com.hotmail.brock_stuart.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Illegal attempt to construct Singleton
		// Singleton singleton = new Singleton();
		
		//Get the only instance of the object available
		Singleton singleton1 = Singleton.getInstance();
		
		Singleton singleton2 = Singleton.getInstance();
		
		singleton1.showMessage();
		
		if (singleton1 == singleton2) {
			System.out.println("singleton1 and singleton2 are the same object");
		} else {
			System.out.println("The two singletons are differen!!!!");
		}
	}

}
