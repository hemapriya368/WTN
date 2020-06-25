package com.wipro.languagebasics;

public class exp23 {
public static void main(String[] args) {
	int arg[] = {1,23,45,64,34,87};
	int key=64,i;
	for( i=0;i<arg.length;i++) {
		if(arg[i]==key)
		{
			System.out.println(i);
			break;
		}
	}
	if(i==arg.length)
		System.out.println("-1");
}
}
