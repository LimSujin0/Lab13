package edu.handong.csee.java.lab13.prob3;//this is a package 

import java.util.Scanner;//import Scanner class

public class MAIN {//this is a public class named MAIN
	public static void main(String[] args) {//this is a main method in this pakcage
		// TODO Auto-generated method stub
		double n1, n2;//this is a double type variable named n1, n2
		Scanner keyboard = new Scanner(System.in);//create keyboard instance of Scanner class 
		
		System.out.print("Enter radius: "); //print out "Enter radius: " on the monitor
		n1 = keyboard.nextDouble();//set n1 to double variable from user.
		Circle c1 = new Circle(n1);//create c1 instance of Cricle class passing n1 as parameter.
		
		System.out.println("Radius: "+ c1.get_Radius());//display Radius of the circle on the monitor
		c1.display();//display area and perimeter of the circle on the monitor.
		
		System.out.print("Enter length and width: ");//print out "Enter length and width: " on the monitor
		n1 = keyboard.nextDouble();//set n1 to double variable from user.
		n2 = keyboard.nextDouble();//set n2 to double variable from user.
		Rectangle r1 = new Rectangle(n1, n2);//create r1 instance of Rectangle class passing n1, n2 as parameter.
		
		System.out.println("Lenth: "+ r1.get_Length());//display Length of the square on the monitor
		System.out.println("Width: "+ r1.get_Width());//display width of the square on the monitor
		r1.display();//display are and perimeter of the square on the monnitor.
	}

}
