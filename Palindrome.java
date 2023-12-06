/*
Question:
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters
and numbers.
Write code below 
*/
import java.util.Scanner;

public class Palindrome{
	public static void main(String []args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String word = scanner.nextLine();

		if (isPalindrome(word)) {
			System.out.println("The entered string is a palindrome.");
		} else {
			System.out.println("The entered string is not a palindrome.");
		}

		scanner.close();
	}

	private static boolean isPalindrome(String str) {
		 
		str = str.replaceAll("\\s", "").toLowerCase();
		String reversed = new StringBuilder(str).reverse().toString();
		return str.equals(reversed);
	}
}


	
