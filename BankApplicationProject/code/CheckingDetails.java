package code;

import java.util.Scanner;
import database.code.ReadUserDetailsFromDatabase;


public class CheckingDetails
{
  // global level variables
  static String sendMoney;
  static String sendPhoneNum;
  static Scanner scan = new Scanner(System.in);

  public static void CheckPhoneNumber
  {
  		System.out.println("");
  		while (true)
  		{
  			System.out.println("Enter Sending PhoneNumber ");
  			int sendPhoneNum = scan.nextInt();
  			if (sendPhoneNum.length()==10)
  			{
  					System.out.println("");
  					break;
  			}
  			else
  			{
  				System.out.println("Enter valid phone number");
  			}
  		}
  }

  public static void CheckAccountNumber
  {

  }

  public static void CheckIFSCcode
  {

  }

  public static void CheckUPIid
  {

  }

  public static void CheckSendMoney
  {
    System.out.println("");
		while (true)
		{
			System.out.println("Enter Money to Send")
			sendMoney = scan.nextFloat();
			if ((SendMoney<=ReadUserDetailesFromDatabase.UserBalance) && (SendMoney>=0))
			{
				System.out.println("");
				break;
			}
			else
			{
				System.out.println("Enter Less than Your Balance Amount");
			}
		}
  }

  public static void CheckMPINpin
  {
    System.out.println("");
    while (true)
    {
        System.out.println("Enter your MPIN pin");
        int usrMpinPin = scan.nextInt();
        if (usrMpinPin==ReadUserDetailesFromDatabase.usrMPINpin)
        {
          System.out.println("Succesfully Transfered");
          viewUsrBankReletedDetailes.viewLastTransactionInPassbook
          SettingsFile.getCurrentDate();
          SettingsFile.getCurrentTime();
          break;
        }
        else
        {
          System.out.println("Enter valid MPIN pin");
        }
    }
  }

}
