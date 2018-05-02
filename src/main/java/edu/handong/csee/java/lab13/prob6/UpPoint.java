package edu.handong.csee.java.lab13.prob6;//this is a package

public class UpPoint implements CapitalPrint {//this is a public class named UpPoint that has Interface of CapitalPrinter
	private int x, y;//this is a private integer variable named x, y
	UpPoint(int x, int y){//this is a Constructor that has two integers as a parameters
		this.x = x;//set x in class variable to x(parameter)
		this.y = y;//set y in class variable to y(parameter)
	}
	public String toString() {//this is a public method named toString that return String type
		return "x : " + x + " y : " + y;//return x : value of x , y : value of y
	}
}
