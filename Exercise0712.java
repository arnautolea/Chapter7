/*(Duplicate Elimination) Use a one-dimensional array to solve the following problem:
Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number
is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst case,”
in which all five numbers are different. Use the smallest possible array to solve this problem. Display
the complete set of unique values input after the user enters each new value.*/
package Chapter07;

import java.util.Scanner;

public class Exercise0712 {
	
	public static void main (String[] args){
		// Create array that can hold 5 int values 
		int[] numbers = new int[5];
		Scanner input = new Scanner(System.in);
			// Prompt user to enter 5 numbers
			System.out.println("Enter 5 numbers, each between 10 and 100!");
			for (int i = 0; i < numbers.length; i++){
				// Message for every number
				System.out.printf("number %d: ", (i+1));
				int number = input.nextInt();
					if(number >= 10 && number <= 100){
						if (contains(numbers, number)){
							numbers[i] = number;
							System.out.println(number + " is unique");
						}
						else {
							System.out.println("Number is a duplicate");
						}
					}
					else {
						System.out.println("number must be between 10 and 100");
					}
			System.out.println("\nUnique number(s): ");
				for (int n : numbers) {
					if (n != 0){
					System.out.println(n);
					}
				}
			}// for
		input.close();
	}//main
	public static boolean contains(int[] array, int num) {
	    for (int i : array) {
	        if (i == num) {
	            return false;
	        }
	    }
	    return true;
	}//close method cantains
}//end of class