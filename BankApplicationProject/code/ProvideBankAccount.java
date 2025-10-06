package code;

//import dependencies packages
import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

public class ProvideBankAccount
{
	//global variables
	static String generatedAccontNum;
	static String generatedIFSCcode;
	static String generatedCustomerID;
	static String generatedUPIid;
	static String UserBalance;

	public static void ProvideAccountNumber throws IOException
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
        generatedAccontNum = usrAccountNum.toString();
        System.out.println("");
	}

	public static void ProvideIFSCcode throws IOException
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
        generatedIFSCcode = usrIFSCcode.toString();
        System.out.println("");
	}

	public static void ProvideCustomerID throws IOException
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
        generatedCustomerID = usrCustomerID.toString();
        System.out.println("");
	}

	public static void ProvideUPIid throws IOException
	{
		int length = 3;
		String characters = "abcdefghijklmnopqrstuvwxyz";
		Random random = new Random();
		StringBuilder usrUPIid = new StringBuilder();
		for (int i = 0; i < length; i++)
		{
				int index = random.nextInt(characters.length());
				usrUPIid.append(characters.charAt(index));
		}
		generatedUPIid = usrUPIid.toString();
		System.out.println("");
	}

	public static void ProvideSavingAccount throws IOException
	{
		UserBalance="1000";
	}
}
