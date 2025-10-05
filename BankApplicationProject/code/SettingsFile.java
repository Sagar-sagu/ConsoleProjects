package code;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;

public class SettingsFile
{
	static String usrMPINpin;
	static Scanner scan=new Scanner(System.in);

	public static void settings
	{
		System.out.println("");
		while (true)
		{
			System.out.println("Here you can Set Your MPIN PIN");
			System.out.println("Create 6 Digite Pin");
			usrMPINpin=scan.nextLine();
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

    public static void getCurrentDate
		{
        static LocalDate date = LocalDate.now();
    }

    public static void getCurrentTime
		 {
        static LocalTime time = LocalTime.now();
    }
}
