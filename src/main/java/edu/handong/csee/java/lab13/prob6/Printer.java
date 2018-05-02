package edu.handong.csee.java.lab13.prob6;//this is a package name

public class Printer {//this is a public class named Printer 
	public static void print(Object object) {//this is a public static method named print that has Object type as parameter
		String str = object.toString();//set str to return value of toString method in object
		if(object instanceof CapitalPrint) {//if the object is an instance of CapitalPrinter
			str= str.toUpperCase();//change str to upper case.
		}
		System.out.println(str);//display str on the monitor
	}
}
