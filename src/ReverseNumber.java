import java.util.Scanner;

/**
 * 
 */

/**
 * @author davidshinabarger
 *
 */ 
// PROGRAM GOAL: Prompt the user to input a numeric number. 
// Reverse the Number
// Output the result of this number.
// Include at least 4 Comments Throughout the code
// Successfully share on GitHub
// HINT: Think about using division & remainder / & % 


public class ReverseNumber {
	public static void main(String args[])
	{
		int userNumber = 0;
		int reverseNumber = 0;
		
		// Ask user for input
		System.out.println("Please enter a number: ");
		Scanner in = new Scanner(System.in);
		
		// Assign user's input to userNumber
		userNumber = in.nextInt();
		System.out.println("Your number: " + userNumber);
		reverseNumber = reverse(userNumber);
		System.out.println("The reverse number is: " + reverseNumber);
		//
	}

	private static int reverse(int userNumber) {
		// TODO Auto-generated method stub
		int reverseNumber = 0;
		int tempNum;
		while (userNumber > 0) {
			tempNum = userNumber % 10;
			userNumber = userNumber / 10;
			reverseNumber = (reverseNumber * 10) + tempNum; 
		}
		return reverseNumber;
	}
}
