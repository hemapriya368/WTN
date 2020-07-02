package com.wipro.exceptionHandling;

public class MathOperation {
	
	public static void main(String[] args) {
int a[]=new int[5];
int sum=0;
try {
for(int i=0;i<5;i++) {
	a[i]=Integer.parseInt(args[i]);
	sum+=a[i];
}
System.out.println(sum);
System.out.println(sum/2);
}
catch(Exception e){
	System.out.println("Something went wrong");
}
	}
}
