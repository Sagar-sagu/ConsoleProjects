package database.code;

//imported the dependencies packages
import java.io.FileWriter;
import java.io.IOException;
import code.*;

public class WriteUserDetailsToDatabase
{
	//Login Methodes
	public static void writeLoginUserName() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/LoginFiles/UserName.txt");
        WriteDetailes.write(SignInFile.usrName);
        WriteDetailes.close();
    }

	public static void writeUserId() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/LoginFiles/UserID.txt");
        WriteDetailes.write(SignInFile.userID);
        WriteDetailes.close();
    }

	public static void writeUserSecurityPIN() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/LoginFiles/SecurityPIN.txt");
        WriteDetailes.write(SignInFile.securityPIN);
        WriteDetailes.close();
    }

		//UserBankRelated Methodes
	public static void writeUserName() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/UserBankRelatedDetailesFiles/usrName.txt");
        WriteDetailes.write(getUserBankRelatedDetailes.usrName);
        WriteDetailes.close();
    }


	public static void writeUserFatherName() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/UserBankRelatedDetailesFiles/usrFatherName.txt");
        WriteDetailes.write(getUserBankRelatedDetailes.usrFatherName);
        WriteDetailes.close();
    }


	public static void writeUserDateOfBirth() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/UserBankRelatedDetailesFiles/usrDateOfBirth.txt");
        WriteDetailes.write(getUserBankRelatedDetailes.usrDateOfBirth);
        WriteDetailes.close();
    }


	public static void writeUserAge() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/UserBankRelatedDetailesFiles/usrAge.txt");
        WriteDetailes.write(getUserBankRelatedDetailes.usrAge);
        WriteDetailes.close();
    }


	public static void writeUserGender() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/UserBankRelatedDetailesFiles/usrGender.txt");
        WriteDetailes.write(getUserBankRelatedDetailes.usrName);
        WriteDetailes.close();
    }


	public static void writeUserPhoneNumber() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/UserBankRelatedDetailesFiles/usrPhoneNum.txt");
        WriteDetailes.write(getUserBankRelatedDetailes.phoneNum);
        WriteDetailes.close();
    }


	public static void writeUserAddress() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/UserBankRelatedDetailesFiles/usrAddress.txt");
        WriteDetailes.write(getUserBankRelatedDetailes.usrAddress);
        WriteDetailes.close();
    }

		//ProvideBankAccount Methodes
		public static void writeUserAccountNumber() throws IOException
		{
				FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/ProvideBankAccountDetailes/UserAccountNumber.txt");
				WriteDetailes.write(ProvideBankAccount.generatedAccontNum);
				WriteDetailes.close();
		}

		public static void writeUserCustomerID() throws IOException
		{
			 	FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/ProvideBankAccountDetailes/UserCustomerID.txt");
				WriteDetailes.write(ProvideBankAccount.generatedCustomerID);
				WriteDetailes.close();
		}

		public static void writeUserIFSCcode() throws IOException
		{
			 	FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/ProvideBankAccountDetailes/UserIFSCcode.txt");
				WriteDetailes.write(ProvideBankAccount.generatedIFSCcode);
				WriteDetailes.close();
		}

		public static void writeUserBalance() throws IOException
		{
				FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/ProvideBankAccountDetailes/UserBalance.txt");
				WriteDetailes.write(ProvideBankAccount.UserBalance);
				WriteDetailes.close();
		}

		public static void writeUserUPIid() throws IOException
		{
				FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/ProvideBankAccountDetailes/UserUPIid.txt");
				WriteDetailes.write(ProvideBankAccount.generatedUPIid);
				WriteDetailes.close();
		}

		//BankFeatures Methodes
		public static void writeUserSetMPINpin() throws IOException
		{
				FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/BankFeaturesDetailes/UserSetMPINpin.txt");
				WriteDetailes.write(SettingsFile.usrMPINpin);
				WriteDetailes.close();
		}

		public static void writeUserTransactionHistory() throws IOException
		{
			FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/BankFeaturesDetailes/UserTransactionHistory.txt");
			WriteDetailes.write(SettingsFile.usrMPINpin);
			WriteDetailes.close();
		}

		public static void writeUserSendPhoneNumber() throws IOException
		{
			FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/BankFeaturesDetailes/UserSendPhoneNumber.txt");
			WriteDetailes.write(CheckingDetails.sendPhoneNum);
			WriteDetailes.close();
		}

		public static void writeUserSendMoney() throws IOException
		{
			FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/BankFeaturesDetailes/UserSendMoney.txt");
			WriteDetailes.write(CheckingDetails.sendMoney);
			WriteDetailes.close();
		}

		public static void writeUserSendAccountNumber() throws IOException
		{
			FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/BankFeaturesDetailes/UserSendAccountNumber.txt");
			WriteDetailes.write(CheckingDetails.sendAccNum);
			WriteDetailes.close();
		}

		public static void writeUserSendIFSCcode() throws IOException
		{
			FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/BankFeaturesDetailes/UserSendIFSCcode.txt");
			WriteDetailes.write(CheckingDetails.sendIfscCode);
			WriteDetailes.close();
		}


			public static void writeUserTransactionDate() throws IOException
			{
				FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/BankFeaturesDetailes/UserTransactionDate.txt");
				WriteDetailes.write(SettingsFile.date);
				WriteDetailes.close();
			}


			public static void writeUserTransactionTime() throws IOException
			{
				FileWriter WriteDetailes = new FileWriter("database/DatabaseFolders/BankFeaturesDetailes/UserTransactionTime.txt");
				WriteDetailes.write(SettingsFile.time);
				WriteDetailes.close();
			}
}
