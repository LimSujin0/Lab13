package edu.handong.csee.java.lab13.prob1;//this is a package name

public class InstanceOf {//this is a public class names InstanceOf
	public static void WhatFriend(Friend friend) {//this is a static method named WhatFriend
		if(friend instanceof ClassFriend)//if friend is instance of ClassFriend
			((ClassFriend)friend).classFriend();//execute classFriend() method in ClassFriend class
		else if(friend instanceof SchoolFriend)//else if friend is instance of SchoolFriend
			((SchoolFriend)friend).schoolFriend();//execute schoolFriend() method in SchoolFriend class
		else//else(if friend is instance of Friend)
			friend.JustFriend();//execute JustFriend() method in Friend class
	}
	
}
