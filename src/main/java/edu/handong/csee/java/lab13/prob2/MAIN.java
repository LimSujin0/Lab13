package edu.handong.csee.java.lab13.prob2;//this is package name

public class MAIN {//this is main class of this package

	public static void main(String[] args) {//this is main method
		// TODO Auto-generated method stub
		Book book = new Book("Simple Book");//create book instance of Book class
		Science science = new Science("Hello Physics!", "ScienceWorld");//create science instance of Science class
		History history = new History("What Is history?", "E.H.Corr");//create history instance of History class
		History history2 = new History("The South Korea", " Judis");//create history2 instance of History class
		
		book.show();//execute show() method in the book class
		science.show();//execute show() method in the science class
		history.show();//execute show() method in the history class
		history2.show();//execute show() method in the history class
	}

}
