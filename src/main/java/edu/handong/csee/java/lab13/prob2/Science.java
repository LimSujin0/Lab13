package edu.handong.csee.java.lab13.prob2;//this is package name

public class Science extends Book{//this is class named Science that inherits Book class
	private String publisher;//this is a private String type variable named publisher;
	public Science(String Name, String Publisher) {//this is constructor of Science class that has parameters of string types
		super(Name);//Constructor in a subclass invoke constructor from base class
		this.publisher = Publisher;//set publisher variable to Publisher(parameter) 
	}
	public String toString() {//this is a public method named toString that returns String type
		return super.toString() + "\n\tPublisher: " + publisher;//return book name, id, and publisher of the object
	}
	public void show() {//this is a public method named show
		System.out.println("<<<Science>>>" + this.toString());//display the book id, name and publisher in monitor
	}
}
