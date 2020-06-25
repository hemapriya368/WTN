package com.wipro.languagebasics;

public class exp19 {
public static void main(String[] args) {
	int a = Integer.parseInt(args[0]);
	int rem=0,t=0;
	while(a>0) {
		rem = a%10;
		t=t*10+rem;
		a=a/10;
	}
	System.out.println(t);
}
}
