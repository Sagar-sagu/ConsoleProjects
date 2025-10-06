package code;

import java.io.IOException;
import database.code.ReadUserDetailsFromDatabase;

public class viewUsrBankReletedDetailes
{
	public static void viewPassBookInterFace throws IOException
	{
		System.out.println("");
		System.out.println("Name :- " + ReadUserDetailsFromDatabase.UserName);
		System.out.println("Father Name :- " + ReadUserDetailsFromDatabase.UserFatherName);
		System.out.println("Account Number :- " + ReadUserDetailsFromDatabase.UserAccountNumber);
		System.out.println("IFSC code :- " + ReadUserDetailsFromDatabase.UserIFSCcode);
		System.out.println("Customer ID :- " + ReadUserDetailsFromDatabase.UserCustomerID);
		System.out.println("Date of Birth :- " + ReadUserDetailsFromDatabase.UserDateOfBirth);
		System.out.println("Age :- " + ReadUserDetailsFromDatabase.UserAge);
		System.out.println("Address :- " + ReadUserDetailsFromDatabase.UserAddress);
	}

	public static void viewLastTransactionInPassbook throws IOException
	{
		  System.out.println("");
		//	System.out.println("Here you can See Last Transaction only");
			System.out.println("Debited From ");
			System.out.println("Account Name :- " + ReadUserDetailsFromDatabase.UserName);
			System.out.println("PhoneNumber :- " + ReadUserDetailsFromDatabase.UserPhoneNumber);
			System.out.println("Amount :- " + ReadUserDetailsFromDatabase.UserSendMoney);
			System.out.println("TransactionTime :- " + ReadUserDetailsFromDatabase.UserTransactionTime );
			System.out.println("TransactionDate :- " + ReadUserDetailsFromDatabase.UserTransactionDate);
			System.out.println("");
			System.out.println("Credited To ");
			System.out.println("PhoneNumber :- " + ReadUserDetailsFromDatabase.UserSendPhoneNumber);
	}
}
