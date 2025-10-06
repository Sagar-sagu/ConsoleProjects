package code;

//imported dependencies packages
import java.util.Scanner;
import java.io.IOException;
import database.code.ReadUserDetailsFromDatabase;

public class features
{
	static Scanner scan = new Scanner(System.in);


	public static void 	SendMoneyTruoghPhoneNumber throws IOException
	{
		CheckingDetails.CheckPhoneNumber();
		CheckingDetails.CheckSendMoney();
		CheckingDetails.CheckMPINpin();
	}

	public static void SendMoneyTruoghAccountNumber throws IOException
	{
		CheckingDetails.CheckAccountNumber();
		CheckingDetails.CheckIFSCcode();
		CheckingDetails.SendingAccountNumber();
		CheckingDetails.SendingIFSCcode();
		CheckingDetails.CheckSendMoney();
		CheckingDetails.CheckMPINpin();
	}

	public static void CheckBalance throws IOException
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
