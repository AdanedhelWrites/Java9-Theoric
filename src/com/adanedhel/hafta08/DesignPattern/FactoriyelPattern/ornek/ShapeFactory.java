package com.adanedhel.hafta08.DesignPattern.FactoriyelPattern.ornek;



public class ShapeFactory {
	public static Shape getShape(EShape shape) {
		switch (shape) {
		case CIRCLE: return new Circle();
		case RECTANGLE: return new Rectangle();
		case SQUARE: return new Square();
		default: return new Circle();
			
		}
	}
}
