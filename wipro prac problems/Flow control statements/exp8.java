package com.wipro.languagebasics;

public class exp8 {
	public static void main(String[] args) {
		String a = args[0];
		char s[] = a.toCharArray();
		if((s[0]>=65 && s[0]<=90) || (s[0])>=97 && s[0]<=122)
			System.out.println("Alphabhet");
		else if(s[0]>=48 && s[0]<=57)
			System.out.println("Digit");
		else
			System.out.println("Special Character");
	}

}
