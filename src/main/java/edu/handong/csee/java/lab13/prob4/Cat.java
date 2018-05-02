package edu.handong.csee.java.lab13.prob4;//this is pakcage

public class Cat extends Animal implements Pet{//this is a Cat class that inherits Animal and has Pet interface.
	public String food() {//this is a public method named food that returns String type
		return "(Cat!)" + "Fish"; //return "(Cat!) Fish"
	}
}
