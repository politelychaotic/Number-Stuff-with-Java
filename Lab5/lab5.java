 /**
     * lab5.java - String to number to String
     * Author:     Davin
     * Project:    Lab Project 5
     * Problem Description: This program takes a string input of a 2-digit
     * number and converts it into 2 single digit ints by
     * subtracting with zero.
     * Then the first and second digits are printed to the screen in order
     * The sum of the two numbers is printed along with their
     * product.
     * Finally, the program takes the first digit, adds one to it
     * then multiples by 10 and adds on the second digit to make
     * a number 10 more than the original.
     */

import java.util.Scanner;

public class lab5
{
	public static void main(String[] args)
    {
		//creates a constant of unicode '0'
		final int ZERO = (int)'\u0000';
		System.out.println(ZERO);
		
		//create scanner object
		Scanner scan = new Scanner(System.in);
		
		//introduce program
		System.out.println("Please enter any 2-digit number: ");
		
		//take in input using scanner
	    String userin = scan.nextLine();
	    
	    //isolate first digit of the number
		char char1 = userin.charAt(0);
		
		//subtract with zero so you don't get weird results
		int num1 = (int)char1 - '0';
		
		//isolate second digit of the number
		char char2 = userin.charAt(1);
		
		//subtract with zero again so you don't get weird results
		int num2 = (int)char2 - '0';
		
		//'printf' and '%s' allow for string formatting with variables
		System.out.printf("The first digit is: %s\nThe second digit is: %s", num1, num2);
		
		//print out the sum and then the product of the 2 digits
		System.out.println("\nThe sum of the numbers is: " + (num1+num2));
		System.out.println("The product of the numbers is: " + (num1*num2));
		
		//increment the first digit by 1
		num1++;
		
		//to get original number +10
		int num3 = (num1*10) + num2;
		System.out.println("New number is: " + num3);
    }
}
