package edu.handong.csee.java.lab13.prob4;//this is a package

import java.util.Scanner;//import Scanner class
public class Master {//this is a public class named master
	public void feed(Pet pet) {//this is a public void type method that has Pet as a parameter
		System.out.println("Feed: "+ pet.food());//display "Feed:" + animal's food on the monitor 
	}
	
	public static void main(String[] args) {//this is a main method in this package
		String cat_name, dog_name;//this is String type variables named cat_name and dog_name
		
		Master master = new Master();//create mater instance of Mater class 
		Cat cat = new Cat();//create cat instance of Cat class
		Dog dog = new Dog();//crate dog instance of Dog class
		
		Scanner keyboard = new Scanner(System.in);//crate keyboard instance of Scanner class
		System.out.print("Enter the cat name and dog name: ");//display "Enter the cat name and dog name: " on the monitor
		cat_name = keyboard.next();//set cat_name to String from user
		dog_name = keyboard.next();//set dog_name to String from user
		
		cat.setName(cat_name);//execute setName method in cat class that has cat_name parameter
		cat.getName();//execute setName method in cat class
		master.feed(cat);//execute feed method in the master class that has dog object as parameter
		
		dog.setName(dog_name);//execute setName method in dog class that has dog_name parameter
		dog.getName();//execute setName method in dog class
		master.feed(dog);//execute feed method in the master class that has cat object as parameter
	}
}
