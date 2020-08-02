package com.wipro.strings;

public class exp4 {
	public static String firstHalf(String str) {
		if(str.length()%2==0)
			return str.substring(0,str.length()/2);
		else
			return "";
		  
		}
	public static void main(String[] args) {
		String s="TomCat";
		System.out.println(firstHalf(s));
	}

}
