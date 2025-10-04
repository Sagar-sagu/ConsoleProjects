package database.code;

import java.io.FileWriter;
import java.io.IOException;
import code.SignInFile;
import code.getUserBankRelatedDetailes;

public class WriteUserDetailesToDatabase
{
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

}
