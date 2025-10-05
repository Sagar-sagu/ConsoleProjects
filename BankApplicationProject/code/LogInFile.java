package code;

import java.util.Scanner;
import database.code.ReadUserDetailsFromDatabase;

public class LogInFile
{
	static Scanner scan=new Scanner(System.in);

	public static void checkUserID
	{
		System.out.println("");
		while(true)
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

	public static void checkSecurityPIN
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

	public static void LogInFunction
	{
		checkUserID();
		checkPassword();
		System.out.println("Login Succesfully");
		System.out.println("You Must Create An Bank Account");
		System.out.println("So, You are give your Bank Related Detailes");

		getUserBankRelatedDetailes.openBankAccount();

	}
}
