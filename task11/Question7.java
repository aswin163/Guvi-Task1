package task11;

import java.util.Scanner;

//Q7. Program for InvalidAgeException.

class InvalidAgeException extends Exception{ //Creation of user defined exception
	
	public InvalidAgeException(String str) { // Constructor
		
		super(str);
		System.out.println("Invalid Age Entered");
	}
	
}

public class Question7 {

	public static void main(String[] args) throws InvalidAgeException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter age :");
		int age = sc.nextInt();
		
		if(age<18) {
			
			throw new InvalidAgeException("Invalid Age");
		}
		

	}

}