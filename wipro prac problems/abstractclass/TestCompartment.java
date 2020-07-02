package com.wipro.abstractclass;
 abstract class Compartment {
public abstract String notice();
}
class FirstClass extends Compartment{
     public String notice() {
		return "First compartment for firstcompartment passengers";
	}
}
class Ladies extends Compartment
{
	public String notice() {
		return "Second compartment for ladies";
	}
}
class General extends Compartment{
	public String notice() {
		return  "third compartment is general";
	}
}
class Luggage extends Compartment{
	public String notice() {
		return  "fourth compartment for Luggage";
		
	}
}
class TestCompartment{
	public static void main(String[] args) {
	 Compartment c[]= new Compartment[10];
	 int a[]= {1,2,3,2,4,2,31,1,4,2};
	 int i=0;
	 while(i<10) {
	switch(a[i]) {
	case 1:
		c[0]=new FirstClass();
		System.out.println(c[0].notice());
		
		break;
	case 2:
		c[1]=new Ladies();
		System.out.println(c[1].notice());
	
		break;
	case 3:
		c[2]=new General();
		
		System.out.println(c[2].notice());
		break;
	
	case 4:
		c[3]=new Luggage();
		System.out.println(c[3].notice());
		
		break;
	
	default:System.out.println("Invalid choice");
	}
	i++;
	 }
}}