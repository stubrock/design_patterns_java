package com.hotmail.brock_stuart.factory;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ShapeFactory shapeFactory = new ShapeFactory();
        
        // Create a Circle object
        //
        Shape circle = shapeFactory.getShape("CIRCLE");
        
        circle.draw();
        
        // Create a Rectangle object
        //
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        
        rectangle.draw();
        
        // Create a Square object
        //
        Shape square = shapeFactory.getShape("SQUARE");
        
        square.draw();
	}

}
