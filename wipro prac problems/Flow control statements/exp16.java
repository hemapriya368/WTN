package com.wipro.languagebasics;

public class exp16 {
public static void main(String[] args) {
	int i,count=0,j;
	for(i=10;i<=99;i++) {
		count=0;
		for(j=2;j<=9;j++) {
			if(i%j==0)
				count++;
		}
		if(count==0)
			System.out.println(i);
	}
}
}
