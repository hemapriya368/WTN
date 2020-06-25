package com.wipro.languagebasics;

public class exp33 {
	public static void main(String[] args) {
		int a[] = new int[args.length];
		int i;
		for(i=0;i<args.length;i++)
	   a[i] = Integer.parseInt(args[i]);
		System.out.println("The given array is:");
		for(i=0;i<args.length;i++) {
			System.out.print(args[i]+" ");
			if(i+1==args.length/2)
				System.out.println();
		}
		System.out.println("\nThe reverse of an array is:");
	for(i=a.length-1;i>=0;i--) {
		System.out.print(a[i]+" ");
		if(i==a.length/2)
			System.out.println();
	}
	}

}
