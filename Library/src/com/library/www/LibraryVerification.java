package com.library.www;
import java.util.*;

public class LibraryVerification {

//	public static void main(String[] args) 
	public static void libraryUserPortal()
	{    
		
	    WelcomeOverride r=new WelcomeOverride();
		Scanner sc=new Scanner(System.in);
		Library lib=new Library();
		System.out.println("         --WELCOME TO LIBRARAY-- ");
		System.out.println("DO you have an Account press (Y/N):");
		String account=sc.next();
	    LoginValidation.loginCalc( account,lib);
	    System.out.println("     ------WELCOME------");
	    System.out.println("----------------------------");
	    r.rules();
		System.out.println("Available book types are:");
		System.out.println("----COMICS----");
		System.out.println("----HORROR----");
		System.out.println("----SCIENCE FICTION----");
		System.out.println("----ADVENTURE----");
		System.out.println("----FANTASY----");
		System.out.println("-----------------------------");
		System.out.println("Enter the book type:");
		
		LoginValidation.bookTypes();
		System.out.println("------------------------------");
	    System.out.println("Enter the number of days that you have a book:");
		int days=sc.nextInt();
		System.out.println("-------------------------------");
		while(true)
		{
			if(days>0)
			{
			break;
			}
		   else
		   {
			   System.out.println("Enter the valid data");
			   days=sc.nextInt();
		   }
		}
		lib.setDays(days);
		LibraryDetails a=new LibraryDetails();
		a.libraryOutput(lib.getId(),lib.getPhonenumber());
		a.libraryOutput(lib.getName());
		a.libraryOutput(lib.getDays());
		Classb b= new Classb();
		b.libraryOutput(lib.getDays());
		}
}
