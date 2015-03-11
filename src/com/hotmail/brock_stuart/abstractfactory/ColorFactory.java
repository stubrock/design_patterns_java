package com.hotmail.brock_stuart.abstractfactory;

public class ColorFactory extends AbstractFactory {
	//use getShape method to create shapes.
	public Color getColor(String colorType) {
		if (colorType == null) {
			return null;
		}
		if (colorType.equals("RED")) {
			return new Red();
		} else if (colorType.equals("GREEN")) {
			return new Green();
		} else if (colorType.equals("BLUE")) {
			return new Blue();
		}
		
		return null;
	}
	
	@Override
	Shape getShape(String shape) {
		return null;
	}

}
