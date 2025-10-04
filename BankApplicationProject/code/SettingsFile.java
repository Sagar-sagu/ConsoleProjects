package code;

import java.util.Scanner;

public class SettingsFile
{
	static Scanner scan=new Scanner(System.in);

	public static void settings
	{
		System.out.println("");
		while (true)
		{
			System.out.println("Here you can Set Your MPIN PIN");
			System.out.println("Create 6 Digite Pin");
			String usrMPINpin=scan.nextLine();
			if (usrMPINpin.length()==6)
			{
				System.out.println("Created MPIN pin Succesfully");
				break;
			}
			else
			{
				System.out.println("Create 6 Digite Pin. Please try again ");
			}
		}
	}
}