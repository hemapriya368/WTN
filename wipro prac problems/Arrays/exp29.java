package com.wipro.languagebasics;

public class exp29 {
	public static void main(String[] args) {
		int a[] = {1, 10, 10, 2};
		int i,j,n=0;
		for(i=0;i<a.length;i++) {
			if(a[i]==10) {
				n++;
				continue;
			}
			System.out.println(a[i]);
			for(j=0;j<n;j++)
				System.out.println("0");
			
		}
	}

}
