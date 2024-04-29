package com.library.www;
import java.util.*;

public class Mainbody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		WelcomeOverride a=new WelcomeOverride();
		a.information();
		System.out.println("\n1.ADMIN \n2.USER  \n3.EXIT");
		int adminUser=sc.nextInt();
        while(true) 
        {
            if(adminUser==1||adminUser==2||adminUser==3)	
        {
        switch(adminUser)
		{
		case 1:
	
			System.out.println("------------------------------------------");
			System.out.println("      -----------------------------");
			System.out.println("             -------- -------");
			System.out.println("                   ----");
			System.out.println("ADMIN NAME:");
			ValidationMainBody.usernameLoginAdmin();
            
			System.out.println("ADMIN PASSWORD:");
			ValidationMainBody.passwordLoginAdmin();
			
			System.out.println("        -------WELCOME ADMIN--------");
			System.out.println("1.ADD A BOOK"+"\n"+"2.DELETE A BOOK");
			System.out.println("-------------------------------------");
			int addDelete=ValidationMainBody.addBook();
			LoginValidation.toSelectAddDelte(addDelete);
	        return;
			
		case 2:
			LibraryVerification.libraryUserPortal();
            return;
		case 3:
			 System.out.println("Exited Successfully");
			 System.out.println("1.ADMIN or 2.USER or 3.EXIT");
			 adminUser=sc.nextInt();
		}
		}
        else
        {
        	System.out.println("Select the 1- user or 2-admin");
        	adminUser=sc.nextInt();
        }       
			
	    }

	}
}
