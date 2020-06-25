package com.wipro.languagebasics;

public class exp22 {
public static void main(String[] args) {
	int array[] = {1,3,6,8,2,9};
	int max=0,min=array[0];
	for(int i=0;i<array.length;i++) {
		if(array[i]>max) {
			max=array[i];
		}
		if(array[i]<min) {
			min=array[i];
		}
	}
	System.out.println("Maximum value of the array is:"+max);
	System.out.println("Minimum value of the array is:"+min);
}
}
