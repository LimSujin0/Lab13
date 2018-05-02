package edu.handong.csee.java.lab13.prob4;//this is a package

public class Animal {//this is class named Animal. this is super class of Cat and Dog
	private String name;//this is private String type variable named name
	public void setName(String name) {//this is a public method named set Name that has String type parameter
		this.name = name;//set name in this object to name(parameter)
	}
	public void getName() {//this is a public method named getName
		System.out.println("Name: " + name);//display the animal's name in monitor
	}
}
