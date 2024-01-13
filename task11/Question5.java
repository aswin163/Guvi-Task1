package task11;

import java.util.Scanner;

// Q5. program for ArrayOutOFBoundException and StringIndexOutOfBoundException using try and catch.

public class Question5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] array = new int[4]; // Declaring an array with index of 4
		System.out.println("Enter a value for A : ");
		int a = sc.nextInt();
		System.out.println("Enter a value for B : ");
		int b = sc.nextInt();
		int c =a+b; // Calculating C by adding a and b
		String s = "Guvi"; // Declaring a string with value and length of 4
		
		try { // Try for Array
			array[6] = c;  // Storing the value of c in index 6 of the array. But declared index is 4, so it throws exception and execution goes to catch
		}
		catch(ArrayIndexOutOfBoundsException ai){ // Array Exception
			
			System.out.println("!! Array index is invalid !!"); // Printing the exception message 
			System.out.println(); // Printing a empty line
			ai.printStackTrace(); // This statement stores the exception hierarchy in the exception variable
			System.out.println(ai); // This prints the exception
		}
		
		try { // Try for String
			
			System.out.println(s.charAt(6));  // trying to print the value at the 6th position of string. But declared string is of length 4, so it throws exception and execution goes to catch
		
		}
		
		catch(StringIndexOutOfBoundsException si) { // String Exception
			
			System.out.println();  // Printing a empty line
			System.out.println("!! String index is invalid !!");  // Printing the exception message
			System.out.println();  // Printing a empty line
			si.printStackTrace();  // This statement stores the exception hierarchy in the exception variable
			System.out.println(si); // This prints the exception
		
		}
				
	}

}
