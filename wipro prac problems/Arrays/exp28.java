package com.wipro.languagebasics;

public class exp28 {
	public static void main(String[] args) {
		int a[] = {10,3,6,1,2,7,9};
		int i,sum=0,j;
		for(i=0;i<a.length;i++) {
			if(a[i]== 6) 
			{
				for(j=i+1;j<a.length;j++) {
					if(a[j]==7) {
						i=j+1;
						continue;
					}
				}
			}
				sum=sum+a[i];
		}
		System.out.println(sum);
		
	}

}
