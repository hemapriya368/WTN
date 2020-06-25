package com.wipro.languagebasics;

public class exp31 {
	public static void main(String[] args) {
		int a[] = {1,1,1,4};
		int count=0,i;

	for(i=0;i<a.length;i++){
		if(a[i]==1||a[i] == 4)
			count++;
	}
	if(count==a.length)
		System.out.println("True");
	else
		System.out.println("False");
	}
}
