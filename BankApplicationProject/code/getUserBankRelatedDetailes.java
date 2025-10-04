package code;

import java.util.Scanner;

public class getUserBankRelatedDetailes
{
	//globle level varaibles
	static Scanner scan = new Scanner(System.in);
	static String phoneNum;
	static String usrName;
	static String usrFatherName;
	static String usrDateOfBirth;
	static String usrAge;
	static String usrGender;
	static String usrAddress;

	public static void getUserName
	{
		System.out.println("");
		System.out.println("Enter your Full Name");
		usrName = scan.nextLine();
	}

	public static void getUserFatherName
	{
		System.out.println("");
		System.out.println("Enter your Father Name");
		usrName = scan.nextLine();
	}

	public static void getUserDateOfBirth
	{
		System.out.println("");
		System.out.println("Enter your Date Of Birth");
		usrDateOfBirth = scan.nextLine();
	}

	public static void getPhoneNumber
	{
		System.out.println("");
		while (true)
		{
			System.out.println("This PhoneNumber Linked to Your Bank Account")
			System.out.println("Enter your PhoneNumber");
			phoneNum = scan.nextLine();
			if (phoneNum.length()==10)
			{
				System.out.println("");
				break;
			}
			else
			{
				System.out.println("Enter valid PhoneNumber");
			}
		}
	}

	public static void getUserAge
	{
		System.out.println("");
		while (true)
		{
			System.out.println("Enter your Age");
			usrAge = scan.nextLine();
			if (usrAge>=0)
			{
				System.out.println("");
				break;
			} 
			else
			{
				System.out.println("Age greater than Zero");
			}
		}
	}	

	public static void getGender
	{
		System.out.println("");
		while (true)
		{
			System.out.println("Enter your Gender");
			System.out.println("1.Male")
			System.out.println("2.FeMale")
			usrGender = scan.nextLine();
			if (usrGender.equalsIgnoreCase("Male") || (usrGender.equalsIgnoreCase("FeMale"))
			{
				System.out.println("");
				break;
			}
			else
			{
				System.out.println("Enter valid Gender");
			}
		}
	}

	public static void getAddress
	{
		System.out.println("");
		System.out.println("Enter your Address");
		usrAddress = scan.nextLine();
	}

	public static void openBankAccount
	{
		getUserName();
		getUserFatherName();
		getUserDateOfBirth();
		getPhoneNumber();
		getUserAge();
		getGender();
		getAddress();

		System.out.println("Your are Succesfully Create An Account");
		System.out.println("");
	}
}