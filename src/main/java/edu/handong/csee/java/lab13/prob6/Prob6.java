package edu.handong.csee.java.lab13.prob6;//this is a package

public class Prob6 {//this is a public class named Prob6
	public static void main(String[] args) {//this is a main method
		// TODO Auto-generated method stub
		UpPoint p1 = new UpPoint(3,3);//create p1 instance of UpPoint class passing 3,3 as parameters
		DownPoint p2 = new DownPoint(2,5);//create p2 instance of DownPoint class passing 2,5 as parameters
		DownPoint p3 = new DownPoint(4,7);//create p3 instance of DownPoint class passing 4,7 as parameters
		UpPoint p4 = new UpPoint(9,12);//create p4 instance of UpPoint class passing 9,12 as parameters
		
		Printer.print(p1);//execute print(p1) method in Printer class
		Printer.print(p2);//execute print(p2) method in Printer class
		Printer.print(p3);//execute print(p3) method in Printer class
		Printer.print(p4);//execute print(p4) method in Printer class
	}

}
