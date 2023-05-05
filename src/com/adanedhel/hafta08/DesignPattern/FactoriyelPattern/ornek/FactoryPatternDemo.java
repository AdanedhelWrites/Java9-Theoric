package com.adanedhel.hafta08.DesignPattern.FactoriyelPattern.ornek;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		Shape shape;
		shape = ShapeFactory.getShape(EShape.CIRCLE);
		shape.draw();
		shape = ShapeFactory.getShape(EShape.RECTANGLE);
		shape.draw();
		shape = ShapeFactory.getShape(EShape.SQUARE);
		shape.draw();
	}
}
