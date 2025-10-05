package code;

//imported dependencies packages
import java.util.Scanner;
import database.code.ReadUserDetailsFromDatabase;

public class features
{
	public static void 	SendMoneyTruoghPhoneNumber
	{
		
	}

	public static void SendMoneyTruoghAccountNumber
	{

	}

	public static void SendMoneyTruoghUPIid
	{

	}

	public static void CheckBalance
	{
		System.out.println("");
		while (true)
		{
				System.out.println("Enter your MPIN pin ")
				int userMpinPin = scan.nextInt();
				if (usrMpinPin==ReadUserDetailesFromDatabase.usrMPINpin)
				{
					System.out.println("");
					System.out.println("Balance :- " + ProvideBankAccount.UserBalance);
					break;
				}
				else
				{
					System.out.println("Invalid MPIN PIN");
				}
		}
	}
}
