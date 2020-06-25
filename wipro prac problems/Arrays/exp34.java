package com.wipro.languagebasics;

public class exp34 {
	public static void main(String[] args) {
		int str1[] = new int[9];
		int str2[][] = new int [3][3];
		int i,j,k=0,max=0;
		for(i=0;i<args.length;i++) {
			 str1[i] = Integer.parseInt(args[i]);
		}
		for(i=0;i<str2.length;i++) {
			for(j=0;j<str2[i].length;j++) {
				str2[i][j] = str1[k++];
				if(str2[i][j]>max)
				max=str2[i][j];
			}
		}
		System.out.println("The given array is :");
		for(i=0;i<str2.length;i++) {
			for(j=0;j<str2[i].length;j++) {
				System.out.print(str2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The biggest number in the given array is "+max);
	}

}
