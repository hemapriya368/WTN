package com.wipro.languagebasics;

public class exp30 {
public static void main(String[] args) {
	int a[] = {23,3,4,1,45,64,2,12};
	int i,j;
	for(i=0;i<a.length;i++) {
		if(a[i]%2==0)
			System.out.println(a[i]);
	}
	for(j=0;j<a.length;j++) {
		if(a[j]%2!=0)
			System.out.println(a[j]);
	}
}
}