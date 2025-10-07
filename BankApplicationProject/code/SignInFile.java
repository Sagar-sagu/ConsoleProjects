package code;

import java.util.Scanner;
import java.io.IOException;
import database.code.WriteUserDetailsToDatabase;

public class SignInFile
{
	static Scanner scan=new Scanner(System.in);
	static String usrName;
	static String userID;
	static String securityPIN;

	public static void getUserName() throws IOException
	{
		System.out.println("");
		System.out.println("Enter your Name");
		usrName = scan.nextLine();
		WriteUserDetailsToDatabase.writeLoginUserName();
	}

	public static void getUserID() throws IOException
	{
		System.out.println("");
		while (true)
		{
        System.out.println("Note: UserID must be 8 Characters and" );
        System.out.println(" Include atleast one or more UpperCase,LowerCase,Numbers,SpecialCharacters");
				System.out.println("Create User ID");
				userID = scan.nextLine();
				if (userID.length()!=8 )
        {
        	System.out.println("Created UserID SuccesFully");
					WriteUserDetailsToDatabase.writeUserId();
        	break;
        }
        else
        {
            System.out.println("UserID must be 8 characters. Please try again.");
        }
    }
	}

	 public static void getSecurityPIN() throws IOException
    {
        System.out.println("");
        while (true)
        {
		        System.out.println("Note: you Create 4 Security PIN ");
		        System.out.println("Create Security PIN");
		        securityPIN = input.nextLine();
		        if (password.length() != 4 )
		        {
		        	System.out.println("Created security pin SuccesFully");
							WriteUserDetailsToDatabase.writeUserSecurityPIN();
		        }
		        else
		        {
		            System.out.println("Security PIN must 4 Digits. Please try again.");
	        	}
	    	}

    }

    public static void SigInFunction() throws IOException
    {
    	getUserName();
    	getUserID();
    	getSecurityPIN();
    	System.out.println("");
    	System.out.println("you can login now");
    }

}
