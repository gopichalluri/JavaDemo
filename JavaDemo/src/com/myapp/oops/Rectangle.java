package com.myapp.oops;

// Encapsulation
public class Rectangle extends Shape{
	
	
	public Rectangle(double width, double height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	
	// Overriding
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return getWidth()*getHeight();
	}
}
