package com.wipro.languagebasics;

public class exp17 {
public static void main(String[] args) {
	int a = Integer.parseInt(args[0]);
	int rem;
	int t = 0;
	while(a>0){
		rem=a%10;
		t+=rem;
		a=a/10;
	}
	System.out.println(t);
}
}
