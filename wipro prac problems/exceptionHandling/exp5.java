package com.wipro.exceptionHandling;
class InvalidageException extends Exception
{
    public InvalidageException()
    {
        // Call constructor of parent Exception
    }
}

public class exp5 {
	void meth(String name1,int age1)throws InvalidageException {
	
			if(age1>=18&&age1<60)
				 throw new InvalidageException();
			 else {
				 System.out.println("name:"+name1);
				 System.out.println("age:"+age1);
			 }
		 
	}
public static void main(String[] args) {
	String name=args[0];
	int age=Integer.parseInt(args[1]);
	exp5 obj=new exp5();
	
	try{
		obj.meth(name,age);
	}
	catch(Exception e) {
		System.out.println("Something went wrong");
	}
}
}
