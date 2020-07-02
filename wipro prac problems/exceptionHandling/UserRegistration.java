package com.wipro.exceptionHandling;
class InvalidCountryException extends Exception
{
    public InvalidCountryException()
    {
        // Call constructor of parent Exception
    }
}
public class UserRegistration {
 void registerUser(String username,String userCountry) throws InvalidCountryException {
	 if(userCountry!="India")
		 throw new InvalidCountryException();
	 else
		 System.out.println("User registered successfully");
 }
 public static void main(String args[]) {
	 String name="Hema";
	 String country="India";
	 UserRegistration obj=new UserRegistration();
	 try {
	 obj.registerUser(name,country);
	 }
	 catch(Exception e) {
		 System.out.println("User Outside the india cannot be registered");
	 }
	 
 }
}
