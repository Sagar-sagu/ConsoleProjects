package code;

import java.util.Scanner;
import java.io.IOException;
import database.code.*;


public class CheckingDetails
{
  // global level variables
  static String sendMoney;
  static String sendPhoneNum;
  static String sendAccNum;
  static String sendIfscCode;
  static Scanner scan = new Scanner(System.in);

  public static void CheckSendPhoneNumber() throws IOException
  {
  		System.out.println("");
  		while (true)
  		{
  			System.out.println("Enter Sending PhoneNumber ");
  			int sendPhoneNum = scan.nextInt();
  			if (sendPhoneNum.length()==10)
  			{
  					System.out.println("");
            WriteUserDetailsToDatabase.writeUserSendPhoneNumber();
  					break;
  			}
  			else
  			{
  				System.out.println("Enter valid phone number");
  			}
  		}
  }

  public static void CheckAccountNumber() throws IOException
  {
    System.out.println("");
    while (true)
    {
        System.out.println("Enter your AccountNumber");
        int usrAccNum = scan.nextInt();
        if (usrAccNum==ReadUserDetailesFromDatabase.UserAccountNumber)
        {
          System.out.println("Your Ready For enter IFSC code");
          break;
        }
        else
        {
          System.out.println("Enter valid AccountNumber");
        }
    }
  }

  public static void SendingAccountNumber() throws IOException
  {
    System.out.println("");
    System.out.println("Enter Sending AccountNumber");
    sendAccNum = scan.nextLine();
    WriteUserDetailsToDatabase.writeUserSendAccountNumber();
  }

  public static void SendingIFSCcode() throws IOException
  {
    System.out.println("");
    System.out.println("Enter Sending IFSC code");
    sendIfscCode = scan.nextLine();
    WriteUserDetailsToDatabase.writeUserSendIFSCcode();
  }

  public static void CheckIFSCcode() throws IOException
  {
    System.out.println("");
    while (true)
    {
        System.out.println("Enter your IFSC code");
        int usrIfscCode = scan.nextInt();
        if (usrIfscCode==ReadUserDetailesFromDatabase.UserIFSCcode)
        {
          System.out.println("");
          break;
        }
        else
        {
          System.out.println("Enter valid IFSC code");
        }
    }
  }

  public static String CheckSendMoney() throws IOException
  {
    System.out.println("");
		while (true)
		{
			System.out.println("Enter Money to Send");
			sendMoney = scan.nextFloat();
			if ((sendMoney<=ReadUserDetailesFromDatabase.UserBalance) && (sendMoney>=0))
			{
				System.out.println("");
        WriteUserDetailsToDatabase.writeUserSendMoney();
        return sendMoney;
				break;
			}
			else
			{
				System.out.println("Enter Less than Your Balance Amount");
			}
		}
  }

  public static void CheckMPINpin() throws IOException
  {
    System.out.println("");
    while (true)
    {
        System.out.println("Enter your MPIN pin");
        int usrMpinPin = scan.nextInt();
        if (usrMpinPin==ReadUserDetailesFromDatabase.usrMPINpin)
        {
          System.out.println("Succesfully Transfered");
          viewUsrBankReletedDetailes.viewLastTransactionInPassbook();
          SettingsFile.getCurrentDate();
          SettingsFile.getCurrentTime();
          WriteUserDetailsToDatabase.writeUserTransactionDate();
          WriteUserDetailsToDatabase.writeUserTransactionTime();
          break;
        }
        else
        {
          System.out.println("Enter valid MPIN pin");
        }
    }
  }

}
