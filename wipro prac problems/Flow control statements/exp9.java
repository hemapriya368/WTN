package com.wipro.languagebasics;

public class exp9 {
public static void main(String[] args) {
	String gender =args[0];
	int age = Integer.parseInt(args[1]);
	if(gender=="Female") {
		if(age>=1 && age<=58)
			System.out.print("8.2%");
		else
			System.out.print("9.2%");
		
	}
	else {
		if(age>=1 && age<=58)
			System.out.print("8.4%");
		else
			System.out.print("10.5%");
	}
		
	
}
}
