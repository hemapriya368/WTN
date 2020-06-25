package com.wipro.languagebasics;

public class exp25 {
	public static void main(String[] args) {
		int a[] ={8,4,65,90,34,55,35};
		int i,max1=0,max2=0,min1=a[0],min2=a[0];
		for(i=0;i<a.length;i++) {
			if(a[i]>max1) {
				max1 = a[i];
			}
			if(a[i]<min1)
				min1 = a[i];
		}
		for(i=0;i<a.length;i++) {
				if(a[i]<max1 && a[i]>max2)
					max2 = a[i];
				if(a[i]>min1 && a[i]<min2)
					min2 = a[i];
			
		}
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(min1);
		System.out.println(min2);
	}

}
