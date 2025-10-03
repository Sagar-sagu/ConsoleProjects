import java.util.Scanner;
import code.LogInFile;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("WELCOME TO BANK APPLICATION");
		System.out.println("");
		System.out.println("Get started......");

		//LogInFunctionCalling
		LogInFile.LogInFunction();
	}
}