package com.wipro.inheritance;
class Animal{
	void eat() {
		System.out.println("Animal is eating");
	}
	void sleep(){
		System.out.println("Animal is sleeping");
	}
}
class Bird extends Animal{
	void eat() {
		System.out.println("Bird is eating");
	}
	void sleep() {
		System.out.println("Bird id Sleeping");
	}
	void fly() {
		System.out.println("Bird is flying");
	}
}
public class exp1 {
public static void main(String[] args) {
	Bird obj=new Bird();
	obj.eat();
	obj.sleep();
	obj.fly();
}
}
