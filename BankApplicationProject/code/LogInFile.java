package code;

import java.util.Scanner;

public class LogInFile
{
	static Scanner scan=new Scanner(System.in);
	static String phoneNum;
	static String usrName;

	public static void getUserName
	{
		System.out.println("");
		System.out.println("Enter your Name");
		usrName = scan.nextLine();
	}

	public static void getPhoneNumber
	{
		System.out.println("");
		System.out.println("Enter your PhoneNumber");
		phoneNum = scan.nextLine();
		if (phoneNum.length()==10)
		{
			System.out.println("You are Succesfully Login BankApplication......");
		}
		else
		{
			System.out.println("Enter valid PhoneNumber");
		}
	}
	public static void LogInFunction
	{
		getUserName();
		getPhoneNumber();

		System.out.println("You Must Create An Bank Account");
		System.out.println("So, You are give your Bank Related Detailes");
	}
}