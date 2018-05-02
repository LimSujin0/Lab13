package edu.handong.csee.java.lab13.prob2;//this is package name

public class Book {//this is class named book. this is super class of Science and History
	private static int idCount = 0; //this is private static integer type variable named idCount
	private String BookName;//this is private String type variable named BookName
	private int id;//this is private integer type variable named id
	public Book(String Name) {//this is a constructor of book that has String type parameter
		this.BookName = Name;//set BookName in Book class to Name(parameter)
		idCount++;//add 1 idCount
		id = idCount;//set id to idCount
	}
	public String toString() {//this is public method named toString that returns String
		return "\n\tID: " + id + "\n\tBook Name: " + BookName;//return the id and book name
	}
	public void show() { //this is void method named show that returns void
		System.out.println("<<<BOOK>>>" + this.toString());//display the book id and name in monitor
	}
}
