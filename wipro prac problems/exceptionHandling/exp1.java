package com.wipro.exceptionHandling;
public class exp1 {
	public static void main(String[] args) {
		int i=3;
int a[]= new int[i];
for(int j=0;j<i-1;j++)
{
	a[j]=j+10;
}
a[2]='j';
System.out.println(a[0]);
System.out.println(a[4]);


	}

}
