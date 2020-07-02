package com.wipro.exceptionHandling;

 
	class NumberFormatException extends Exception
	{
	    public NumberFormatException(String s)
	    {
	        // Call constructor of parent Exception
	        super(s);
	    }
	}
	 
	public class exp3
	{
	   void numberCheck(int marks) throws NumberFormatException{
		if(marks>100||marks<0){
			throw new NumberFormatException("number Invalid");
		}
	   }
	   
	    public static void main(String args[])
	    {
	    	exp3 obj = new exp3();
	    	int sum1=0,sum2=0;
	    	int arjun[]= {23,56,12};
	    	int raju[]= {'u',456,34};
	    	for(int i=0;i<3;i++) {
	    		
	        try
	        {
	            obj.numberCheck(arjun[i]);
	            obj.numberCheck(raju[i]);
	            sum1+=arjun[i];
	    		sum2+=raju[i];  
	        }
	        catch (NumberFormatException ex)
	        {
	            System.out.println("Caught the exception");
	            
	        }
	    	}
	    	System.out.println(sum1);
	    	System.out.println(sum2);
	    	}
	    

	}


