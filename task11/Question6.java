package task11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Q6. Login system exception handling while user enters invalid password.

class InvalidPasswordException extends Exception{ // Creating a userdefined exception
	
	public InvalidPasswordException(String str) { // Constructor
		
		super(str);
	}
	
}

class InvalidPassword{
	
	String password;
	
	public void password(String s) throws InvalidPasswordException { 
		
		password = s;
		Pattern pattern = Pattern.compile(password);
		Matcher matcher = pattern.matcher("[A-Z]{1}[a-z0-9]{7}"); // This declares that, password should be of 8 characters long, first letter should be capital and it should include both letters and numbers
		boolean find = matcher.matches(); // This will compare the password enreted with regex pattern and will return true if matches and returns false if it doesn't match
		

		if(!find) { // If password entered doesn't match the regex pattern, it should throw exception 
			
			throw new InvalidPasswordException("Invalid Password"); // It throws the exception that password is invalid and passing it to the user defined exception class
		}
	}
}

public class Question6 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter username : ");
		String uname = sc.nextLine();
		System.out.println("Please Enter Password : ");
		String password = sc.nextLine();
		InvalidPassword obj = new InvalidPassword();
		
		try {
			
			obj.password(password);
		
		}
		
		catch (InvalidPasswordException e) {
			
			System.out.println("!! Invalid Password !!");
			System.out.println();
			System.out.println("Password should contain 8 characters, first character should be a capital letter, it should contain both letters and numbers");
			e.printStackTrace();
			System.out.println(e);
			System.out.println();
		}
		

	}

}
