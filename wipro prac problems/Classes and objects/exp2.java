package com.wipro.classesAndObjects;
class calculator{
	static int num1,num2;
	static int powerInt(int num1,int num2) {
		return (int)Math.pow(num1, num2);
	}
	static double powerDouble(double num3,int num4) {
		return Math.pow(num3, num4);
	}
}
public class exp2 {
	public static void main(String[] args) {
		System.out.println(calculator.powerInt(2,2));
		System.out.println(calculator.powerDouble(3.50,2));
	}

}
