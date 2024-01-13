package task11;

import java.util.Scanner;

//Q4. Java program to handle exception using Try and Catch.


public class Question4 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in); // getting input from user
		System.out.println("Enter value for A : ");
		int a = sc.nextInt();
		System.out.println("Enter value for B : ");
		int b = sc.nextInt();
		int c;
		
		try { // Try method holds the statement where the possible exception statement is executed
			c=a/b;  // Critical statement where exception is expected. If user enters value '0' for variable B, java will throw exception and the execution will jump directly to catch method
			System.out.println("Division is : " +c); // This will be executed only if the user enters valid value for both variables
		}
		catch(ArithmeticException ae) // This method catches the exception and executes the statements inside
		{
			System.out.println("!! Please enter a valid number for B !!");
			System.out.println(); //prints a empty line bewtween outputs
			ae.printStackTrace(); // This statement stores the exception hierarchy in the exception variable
			System.out.println(ae); // This prints the exception
		}
		


	}

}
