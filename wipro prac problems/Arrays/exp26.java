package com.wipro.languagebasics;

public class exp26 {
public static void main(String[] args) {
	int a[] = {45,34,76,9,56};
int i,j,temp=0,k;
	
	for(i=0;i<a.length-1;i++) {
		for(j=0;j<a.length-i-1;j++) {
			if(a[j]>a[j+1]) {
				temp = a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
}  
	for(k=0;k<a.length;k++) {
		System.out.print(a[k]+" ");
		
	}
}
}
