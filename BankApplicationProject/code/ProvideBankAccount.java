package code;

import java.util.Scanner;
import java.util.Random;


public class ProvideBankAccount
{
	public static void ProvideAccountNumber
	{
        int length = 13;
        String characters = "0123456789";
        Random random = new Random();
        StringBuilder usrAccountNum = new StringBuilder();
        for (int i = 0; i < length; i++)
        {
            int index = random.nextInt(characters.length());
            usrAccountNum.append(characters.charAt(index));
        }
        String generatedAccontNum = usrAccountNum.toString();
        System.out.println("");
	}

	public static void ProvideIFSCcode
	{
		int length = 4;
        String characters = "0123456789";
        Random random = new Random();
        StringBuilder usrIFSCcode = new StringBuilder();
        for (int i = 0; i < length; i++)
        {
            int index = random.nextInt(characters.length());
            usrIFSCcode.append(characters.charAt(index));
        }
        String generatedIFSCcode = usrIFSCcode.toString();
        System.out.println("");
	}

	public static void ProvideCustomerID
	{
		int length = 8;
        String characters = "0123456789";
        Random random = new Random();
        StringBuilder usrCustomerID = new StringBuilder();
        for (int i = 0; i < length; i++)
        {
            int index = random.nextInt(characters.length());
            usrCustomerID.append(characters.charAt(index));
        }
        String generatedCustomerID = usrCustomerID.toString();
        System.out.println("");
	}
}