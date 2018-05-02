package edu.handong.csee.java.lab13.prob6;//this is a package name

public class DownPoint {//this is a public class named DownPoint
	private int x, y;//this is a private integer type variable named x, y
	DownPoint(int x, int y){//this is a constructor of DonwPoint Class this has two integers as parameters
		this.x = x;//set x in DownPoint class to x
		this.y = y;//set y in DownPoint class to y
	}
	public String toString() {//this is public method named to Sting that returns String type
		return "x : " + x + " y : " + y;//return x : value of x  y : value of y
	}
}
