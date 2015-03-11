package com.hotmail.brock_stuart.singleton;

public class Singleton {
	
	// create an instance of the Singleton
	private static Singleton instance = new Singleton();
	
	// Private constructor so that class cannot be instanciated.
	private Singleton() {}
	
	// Return the instance of the only object that has been created
    public static Singleton getInstance() {
    	return instance;
    }
    
    public void showMessage() {
    	System.out.println("Hello, I'm single :)");
    }
}
