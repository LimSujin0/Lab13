package edu.handong.csee.java.lab13.prob4;//this is a package name

public class Dog extends Animal implements Pet{//this is a Dog class that inherits Animal and has Pet interface.
	public String food() {//this is public method named food that returns String type
		return "(Dog!)" + "Sausage";//return "(Dog!) Sausage"
	}
}
