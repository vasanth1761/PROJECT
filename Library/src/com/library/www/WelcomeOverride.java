package com.library.www;

public class WelcomeOverride extends WelcomeUsingAbstract implements UpdatedRules {
 
	@Override
	public void information()
	{
		
		System.out.println("    ----WELCOME TO  LIBRARY----");
		
		
	}
   public  void rules()
{
	System.out.println("*****PAYMENT MUST BE CARD*****");
	System.out.println("*****SHOULD TAKE LESS THAN 5 BOOKS PER WEEK*****");
	System.out.println("*****SHOULD RETURN A BOOK WITHIN 10 DAYS*****");
}
}
