package com.hotmail.brock_stuart.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        
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

        // TODO Auto-generated method stub
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        
        // Create a Circle object
        //
        Color red = colorFactory.getColor("RED");
        
        red.fill();
        
        // Create a Rectangle object
        //
        Color green = colorFactory.getColor("GREEN");
        
        green.fill();
        
        // Create a Square object
        //
        Color blue = colorFactory.getColor("BLUE");
        
        blue.fill();
	}

}
