package code;

import java.util.Scanner;
import java.io.IOException;
import database.code.WriteUserDetailsToDatabase;


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

	public static void getUserName() throws IOException
	{
		System.out.println("");
		System.out.println("Enter your Full Name");
		usrName = scan.nextLine();
		WriteUserDetailsToDatabase.writeUserName();
	}

	public static void getUserFatherName() throws IOException
	{
		System.out.println("");
		System.out.println("Enter your Father Name");
		usrName = scan.nextLine();
		WriteUserDetailsToDatabase.writeUserId();
	}

	public static void getUserDateOfBirth() throws IOException
	{
		System.out.println("");
		System.out.println("Enter your Date Of Birth");
		usrDateOfBirth = scan.nextLine();
		WriteUserDetailsToDatabase.writeUserDateOfBirth();
	}

	public static void getPhoneNumber() throws IOException
	{
		System.out.println("");
		while (true)
		{
			System.out.println("This PhoneNumber Linked to Your Bank Account");
			System.out.println("Enter your PhoneNumber");
			phoneNum = scan.nextLine();
			if (phoneNum.length()==10)
			{
				System.out.println("");
				WriteUserDetailsToDatabase.writeUserPhoneNumber();
				break;
			}
			else
			{
				System.out.println("Enter valid PhoneNumber");
			}
		}
	}

	public static void getUserAge() throws IOException
	{
		System.out.println("");
		while (true)
		{
			System.out.println("Enter your Age");
			usrAge = scan.nextLine();
			if (usrAge>=0)
			{
				System.out.println("");
				WriteUserDetailsToDatabase.writeUserAge();
				break;
			}
			else
			{
				System.out.println("Age greater than Zero");
			}
		}
	}

	public static void getGender() throws IOException
	{
		System.out.println("");
		while (true)
		{
			System.out.println("Enter your Gender");
			System.out.println("1.Male");
			System.out.println("2.FeMale");
			usrGender = scan.nextLine();
			if (usrGender.equalsIgnoreCase("Male") || usrGender.equalsIgnoreCase("FeMale"))
			{
				System.out.println("");
				WriteUserDetailsToDatabase.writeUserGender();
				break;
			}
			else
			{
				System.out.println("Enter valid Gender");
			}
		}
	}

	public static void getAddress() throws IOException
	{
		System.out.println("");
		System.out.println("Enter your Address");
		usrAddress = scan.nextLine();
		WriteUserDetailsToDatabase.writeUserAddress();
	}

	public static void openBankAccount() throws IOException
	{
		getUserName();
		getUserFatherName();
		getUserDateOfBirth();
		getPhoneNumber();
		getUserAge();
		getGender();
		getAddress();
		try {
					 ProvideBankAccount.ProvideAccountNumber();
					 ProvideBankAccount.ProvideIFSCcode();
					 ProvideBankAccount.ProvideCustomerID();
					 ProvideBankAccount.ProvideUPIid();
			 } catch (Exception e) {
					 System.out.println("");
			 }

			 System.out.println("");
			 System.out.println("Your are Succesfully Create An Account");
			 System.out.println("So, You can Select Option ViewPassBook for ");
			 System.out.println("See Account Related Details");
			 HomeFile.HomeFunction();

	}
}
