package edu.handong.csee.java.lab13.prob1;//this is a package name

public class prob5 {//this is a class named prob5
	public static void main(String[] args) {//this is a main method of prob1 package
		// TODO Auto-generated method stub
		Friend friend1 = new Friend();//create friend1 instance of Friend class
		SchoolFriend friend2 = new SchoolFriend();//create friend2 instance of SchoolFriend class
		ClassFriend friend3 = new ClassFriend();//create frien3 instance of ClassFriend Class
		
		InstanceOf.WhatFriend(friend1);//execute WhatFriend(friend1) in InstanceOf Class <print out JustFriend
		InstanceOf.WhatFriend(friend2);//execute WhatFriend(friend2) in InstanceOf Class <print out SchoolFriend
		InstanceOf.WhatFriend(friend3);//execute WhatFriend(friend3) in InstanceOf Class <print out ClassFriend

	}

}
