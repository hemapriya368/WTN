package com.wipro.languagebasics;

public class exp11 {
	public static void main(String[] args) {
		String s = args[0];
		char a = s.charAt(0);
		switch(a) {
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
			default:
				System.out.println("Invalid code");
				
		}
	}

}
