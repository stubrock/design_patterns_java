package com.hotmail.brock_stuart.factory;

public class ShapeFactory {
	//use getShape method to create shapes.
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equals("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equals("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equals("SQUARE")) {
			return new Square();
		}
		
		return null;
	}

}
