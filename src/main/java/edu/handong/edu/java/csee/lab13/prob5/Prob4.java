package edu.handong.edu.java.csee.lab13.prob5;//this is a package

import java.util.Scanner;//import Scanner class
public class Prob4 {//this is a public class named Prob4
	public static boolean equals(int[][]n1, int[][]n2) { //this is a public static method named equals that has two multi-dimensional arrays as parameters
		int count = 0; //this is integer type variable named count and set this variable to 0
		if(n1.length != n2.length)//if n1's row length and n2's row length is different
			return false;//return false
		for(int i =0; i < n1.length; i++){//this is nested for loop for i = 0~(n1.length-1)
			for(int j =0 ; j <n1[i].length; j++) {//this is for loop for j=1~(n1[i].length-1)
				if(n1[i][j] != n2[i][j])//is n1[i][j] and n2[i][j] values are different
					count++;//add 1 in count variable
			}
		}
		if(count<=3)//if count is smaller than 3 or 3
			return true;//return true
		else//if count is bigger than 3
			return false;//return false
	}
	public static void main(String[] args) {//this is a main method in this package
		// TODO Auto-generated method stub
		int n1, n2 =0;//this is a integer variable named n1, n2 that will be used for row and column number of arrays
		Scanner keyboard = new Scanner(System.in);//create keyboard instance of Scanner class
		System.out.print("Enter row size(maximum 5) : ");//display "Enter row size(maximum 5) : " on the monitor
		n1 = keyboard.nextInt();//set n1 to integer from user.
		System.out.print("Enter column size(maximum 5) : ");//display "Enter column size(maximum 5) : " on the monitor
		n2 = keyboard.nextInt();//set n2 to integer from user.
		int[][] m1 = new int[n1][n2];//create multi-dimensional arrays named m1 that is n1*n2 size
		
		System.out.print("Enter row size(maximum 5) : ");//display "Enter row size(maximum 5) : " on the monitor
		n1 = keyboard.nextInt();//set n1 to integer from user.
		System.out.print("Enter column size(maximum 5) : ");//display "Enter column size(maximum 5) : " on the monitor
		n2 = keyboard.nextInt();//set n2 to integer from user.
		int[][] m2 = new int[n1][n2];//create multi-dimensional arrays named m2 that is n1*n2 size
		
		System.out.print("Enter List1: ");//display "Enter List1: " on the monitor.
		for(int i =0; i<m1.length; i++) {//this is a nested for loop for i=0~(m1.length-1)
			for(int j =0; j<m1[i].length; j++) {//this is for loop for j=0~(m1[i].length-1)
				m1[i][j] = keyboard.nextInt();//set m1[i][j] to integer from user
			}
		}
		
		System.out.print("Enter List2: ");//display "Enter List2: " on the monitor
		for(int i =0; i<m2.length; i++) {//this is a nested for loop for i=0~(m2.length-1)
			for(int j =0; j<m2[i].length; j++) {//this is for loop for j=0~(m2[i].length-1)
				m1[i][j] = keyboard.nextInt();//set m2[i][j] to integer from user
			}
		}
		
		//print out the arrays 
		for(int i=0; i<m1.length; i++) {//this is a nested for loop for i=0~(m2.length-1)
			for(int j=0; j<m1[i].length; j++) {//this is for loop for j=0~(m1[i].length-1)
				System.out.print(m1[i][j]+" ");//display m1[i][j]'s value on the monitor with " "
			}
			System.out.println();//when the row is changed, insert enter
		}
		
		System.out.println();//insert enter
		for(int i=0; i<m2.length; i++) {//this is a nested for loop for i=0~(m2.length-1)
			for(int j=0; j<m2[i].length; j++) {//this is for loop for j=0~(m2[i].length-1)
				System.out.print(m2[i][j]+" ");//display m2[i][j]'s value on the monitor with " "
			}
			System.out.println();//when the row is changed, insert enter
		}
		System.out.println();//insert enter
		
		if(equals(m1,m2))//if equals(m1,m2) is true
			System.out.println("The two arrays are approximately identical");//print "The two arrays are approximately identical" on the monitor
		else//if equals(m1,m2) is false
			System.out.println("The two arrays are not identical");//print "The two arrays are not identical" on the monitor
		
	}

}
