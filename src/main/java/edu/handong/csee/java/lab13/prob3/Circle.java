package edu.handong.csee.java.lab13.prob3;//this is a package

public class Circle extends Shape{//this is a public class named Circle that extends Shape(abstract class)
	private double radius;//this is a private double type variable named radius
	public Circle(double r) {//this is a constructor of Circle class that has double variable as a parameter
		radius = r;//set radius to r
	}
	public double area() {//this is a public method named area that returns double variable
		return Math.PI *Math.pow(radius, 2);//return area of a circle(2*radius*radius)
	}
	public double perimeter() {//this is a public method named perimeter that returns double variable
		return 2.0*Math.PI*radius;//returns perimeter of the circle(2*pi*radius)
	}
	public double get_Radius() {//this is public method named get_Radius that returns double variable
		return radius;//it returns radius of the circle
	}
}
