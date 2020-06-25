package com.wipro.languagebasics;

public class exp27 {
public static void main(String[] args) {
	int a[] = {1,5,2,6,1,7};
	int i,j,n = a.length;
	
	for(i=0;i<n;i++) {
		for(j=i+1;j<n;j++) {
			if(a[i] == a[j]) {
				a[j] = a[j+1];
				n--;
				j--;
			}
		}
	}
	for(i=0;i<n;i++)
		System.out.println(a[i]);
}
}
