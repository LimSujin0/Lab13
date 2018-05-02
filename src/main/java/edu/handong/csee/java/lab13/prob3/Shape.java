package edu.handong.csee.java.lab13.prob3;//this is a package

public abstract class Shape {//this is a abstract class named Shape.
	public abstract double area();//this is a abstract method named area
	public abstract double perimeter();//this is a abstract method named perimeter
	public void display() {//this is a public method named display
		System.out.println("Area: " + area()+"\nPerimeter: "+perimeter()+"\n");//print out area and perimeter of the shape on the monitor
	}
}
