package org.test;

public class Palindrome {

	static boolean isPalindrome(String str) {
		// Two Pointers pointing to the beginning and the end of the string
		int i = 0, j = str.length() - 1;

		while (i < j) {
			// If there is a mismatch
			if (str.charAt(i) != str.charAt(j))
				return false;
			// Increment first pointer i and decrement second pointer j
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "Nitin";

		if (isPalindrome(str))
			System.out.print("String " +str + " is a palindrome");
		else
			System.out.print("String " +str + " is not a palindrome");

	}

}
