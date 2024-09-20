package Que3;

import java.util.Scanner;

public class Deposite 
{
   public static void amount(int no) throws Bank
   
   {
	  
	  Object Bank;
	if  (no>=0)
		  
	  {
		  System.out.println("your amount is "+ no);
	  }
	 
	  else {
		  Bank b = new Bank("enter valid amount");
		  
		  throw b ;
				  
	       }
	  
	  
		    
		    
		    
   }
   
   
   public static void main(String[] args) throws Bank
   {
	System.out.println("start");
	
       System.out.println("main start");
	
	    Scanner sc1 =new Scanner(System.in);
	    System.out.println("Enter amt");
	    int g = sc1.nextInt();
	   sc1.close();
	
	try{
		amount(g);
	    } 
	catch(Bank e)
	{
		System.out.println(e.fillInStackTrace());
		
      }
   }
}

