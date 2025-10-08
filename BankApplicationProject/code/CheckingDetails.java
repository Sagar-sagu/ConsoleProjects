package code;

import java.util.Scanner;
import java.io.IOException;
import database.code.*;

public class CheckingDetails
{
  // global level variables
  public static String sendMoney;
  public static String sendPhoneNum;
  public static String sendAccNum;
  public static String sendIfscCode;
  static Scanner scan = new Scanner(System.in);

  public static void CheckSendPhoneNumber() throws IOException
  {
  		System.out.println("");
  		while (true)
  		{
  			System.out.println("Enter Sending PhoneNumber ");
  			sendPhoneNum = scan.nextLine();
  			if (sendPhoneNum.equals("10"))
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
        String usrAccNum = scan.nextLine();
        if (usrAccNum.equals(ReadUserDetailsFromDatabase.UserAccountNumber))
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
        String usrIfscCode = scan.nextLine();
        if (usrIfscCode.equals(ReadUserDetailsFromDatabase.UserIFSCcode))
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
			sendMoney = scan.nextLine();
      int TypeCastSendMoney = Integer.parseInt(sendMoney);
      String tempUserBalance =  ReadUserDetailsFromDatabase.UserBalance;
      int TypeCastUserBalance = Integer.parseInt(tempUserBalance);
			if ((TypeCastSendMoney <= TypeCastUserBalance) && (TypeCastSendMoney >= 0))
			{
				System.out.println("");
        WriteUserDetailsToDatabase.writeUserSendMoney();
				break;
			}
			else
			{
				System.out.println("Enter Less than Your Balance Amount");
			}
		}
    return sendMoney;
  }

  public static void CheckMPINpin() throws IOException
  {
    System.out.println("");
    while (true)
    {
        System.out.println("Enter your MPIN pin");
        String usrMpinPin = scan.nextLine();
        if (usrMpinPin.equals(ReadUserDetailsFromDatabase.UserSetMPINpin))
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
