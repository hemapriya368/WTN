package com.wipro.languagebasics;

public class exp32 {
	public static void main(String[] args) {
		int a[] = {1,2,3};
		int b[] = {4,5,6};
		int c[]=new int[2];
		int i=0;
		c[i] = a[a.length/2];
		c[++i] = b[b.length/2];
		for(i=0;i<c.length;i++)
		System.out.print(c[i]+" ");
	}
	}
