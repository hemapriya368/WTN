package com.wipro.languagebasics;

public class exp15 {
public static void main(String[] args) {
	int a =Integer.parseInt(args[0]);
	int count=0;
	for(int i=1;i<=a;i++) {
		if(a%i==0)
			count++;
	}
	if(count==2)
		System.out.println("It is a Prime number");
	else
		System.out.println("It is not a Prime number");
}
}
