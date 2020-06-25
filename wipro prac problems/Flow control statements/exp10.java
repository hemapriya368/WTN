package com.wipro.languagebasics;

public class exp10 {
public static void main(String[] args) {
	String s = args[0];
	char a[] = s.toCharArray();
	char d;
	if(a[0]>=65&&a[0]<=90) {
	  d=(char)(a[0]+32);
	}
	else
      d=(char)(a[0]-32);
	System.out.println(d);	
}
}
