package assignment5;

import java.util.Scanner;

public class FindPalindrome {

	public static void main(String[] args) {
		System.out.println("Please enter a string to test if a 'Palindrome'");
		Scanner sc = new Scanner(System.in);
		PalindromeChecker palindromechecker = new PalindromeChecker(sc.nextLine());
		System.out.println(palindromechecker.isPalindrome() ?  "Given is a Palindrome" : "Given is Palindrome :-(");
		sc.close();

}

}
