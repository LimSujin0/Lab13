package edu.handong.csee.java.lab13.prob2;//this is package name

public class History extends Book{//this is class named History that inherits Book class
	private String Author;//this is a private String type variable named Author;
	public History(String Name, String Author) {//this is constructor of History class that has parameters of string types
		super(Name);//Constructor in a subclass invoke constructor from base class
		this.Author = Author;//set Author variable to Author(parameter) 
	}
	public String toString() {//this is a public method named toString that returns String type
		return super.toString()+"\n\tAuthor: " + Author;//return book name, id, and author of the object
	}
	public void show() {//this is a public method named show
		System.out.println("<<<History>>>" + this.toString());//display the book id, name and author in monitor
	}
}
