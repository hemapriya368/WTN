package com.wipro.languagebasics;

public class exp7 {
	public static void main(String[] args) {
		String a = args[0]; 
		char obj1[] = a.toCharArray();
		if(obj1[0]<obj1[1]) {
			System.out.println(obj1[0]+","+obj1[1]);
		}
		else
			System.out.println(obj1[1]+","+obj1[0]);
	}
}
