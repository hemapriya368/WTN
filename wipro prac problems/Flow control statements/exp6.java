package com.wipro.languagebasics;

public class exp6 {
public static void main(String[] args) {
	if(args.length==0)
		System.out.println("No value");
	else
		for(int i=0;i<args.length;i++) {
			if(i>0)
		System.out.print(",");
			System.out.print(args[i]);
			
			
		}
}
}
