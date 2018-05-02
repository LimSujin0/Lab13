package edu.handong.csee.java.lab13.prob3;//this is a package

public class Rectangle extends Shape{//this is a public class named Rectangle that extends Shape abstract class
	public double length;//this is a double type variable named length
	public double width;//this is a double type variable named width
	public Rectangle(double length, double width) {//this is a Constructor of Rectangle class that has two double variable as parameters.
		this.length = length;//set length of this class to length
		this.width = width;//set width of thie class to width
	}
	public double area() {//this is a public method named area that returns double type
		return length*width;//return area of the rectangle(length*width)
	}
	public double perimeter() {//this is a public method named perimeter that return double type
		return 2*(length+width);//return perimeter of the rectangle(2*(length*width)
	}

	public double get_Length() {//this is a public method named get_Length that returns double type
		return length;//return length of the square
	}
	public double get_Width() {//this is a public method named get_Width that returns double type
		return width;//return width of the square
	}

}
