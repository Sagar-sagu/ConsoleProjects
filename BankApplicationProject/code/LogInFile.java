package code;

import java.util.Scanner;
import java.io.IOException;
import database.code.ReadUserDetailsFromDatabase;

public class LogInFile
{
	static Scanner scan=new Scanner(System.in);

	public static void checkUserName throws IOException
	{
		System.out.println("");
		while (true)
		{
			System.out.println("Enter Your Name As Given IN Account Created Time");
			String userName = scan.nextLine();
			if (userName.equalse(ReadUserDetailsFromDatabase.UserName))
			{
				System.out.println("");
				break;
			}
			else
			{
				System.out.println("InValid Name ");
			}
		}
	}

	public static void checkUserID throws IOException
	{
		System.out.println("");
		while (true)
		{
			System.out.println("Enter your UserID");
			String userID = scan.nextLine();
			if (userID.equalse(ReadUserDetailesFromDatabase.UserID))
			{
				System.out.println("");
				break;
			}
			else
			{
				System.out.println("enter valid UserID");
			}
	 }
	}

	public static void checkSecurityPIN throws IOException
	{
		System.out.println("");
		while(true)
		{
			System.out.println("Enter SecurityPIN");
			String userID = scan.nextLine();
			if (userID.equalse(ReadUserDetailesFromDatabase.securityPIN))
			{
				System.out.println("");
				break;
			}
			else
			{
				System.out.println("enter valid SecurityPIN");
			}
	 }
	}

	public static String ForgetUserID() throws IOException
	 {
			 String forgetUserID = ReadUserDetailsFromDatabase.UserID;
			 return forgetUs;
	 }

	 public static String ForgetSecurityPIN() throws IOException
	 {
			 String forgetSecurityPIN = ReadUserDetailsFromDatabase.securityPIN;
			 return forgetSecurityPIN;
	 }


    public static void RetriveDetailes() throws IOException
    {
        running:
         while (true)
            {
                String showUserID= ForgetUserID();
                String showSecurityPIN= ForgetSecurityPIN();
                System.out.println("");
                System.out.println("What do you want to retrive ?");
                System.out.println("");
                System.out.println("1.UserId");
                System.out.println("2.SecurityPIN");
                System.out.println("3.Both");
                System.out.println("Choose (1/2/3)");
                int choose=input.nextInt();

                switch(choose)
                {
                    case 1:System.out.println("UserID: "+ showUserID);
                    		System.out.println("");
                            break running;
                    case 2:System.out.println("SecurityPIN: "+ showSecurityPIN);
	                    		System.out.println("");
	                    		 break running;
                    case 3:System.out.println("UserID: " + showUserID);
                           System.out.println("SecurityPIN: " + showSecurityPIN);
                           System.out.println("");
                           break running;
                    default:System.out.println("Invalid choice, Enter valid choice");
                        	break;
                }
            }
    }

	public static void LogInFunction throws IOException
	{
		checkUserID();
		checkPassword();
		System.out.println("Login Succesfully");
		System.out.println("You Must Create An Bank Account");
		System.out.println("So, You are give your Bank Related Detailes");

		getUserBankRelatedDetailes.openBankAccount();

	}
}
