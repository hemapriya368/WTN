package com.wipro.languagebasics;

public class exp21 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int sum=0,avg=0;
		for(int i=0;i<a.length;i++) {
			sum=a[i]+sum;
		}
		avg = sum/(a.length);
		System.out.println("Sum="+sum);
		System.out.println("Average="+avg);
	}

}
