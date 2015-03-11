package com.hotmail.brock_stuart.abstractfactory;

public class ShapeFactory extends AbstractFactory{
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

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
