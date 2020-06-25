package com.wipro.languagebasics;

public class exp20 {
public static void main(String[] args) {
	int a =Integer.parseInt(args[0]);
	int rem=0,t=0;
	int temp = a;
	while(temp>0) {
		rem = temp%10;;
		t = t*10+rem;
		temp=temp/10;
	}
	if(t==a)
		System.out.println(a+"is a palindrome");
	else
		System.out.println(a+"is not a palindrome");
}
}
