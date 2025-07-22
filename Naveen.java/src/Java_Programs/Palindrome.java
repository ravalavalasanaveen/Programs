package Java_Programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scanner.nextLine();
		String rev = new StringBuilder(s).reverse().toString();
		System.out.println(s + (s.equals(rev)? " is a Palindrome" : " not a palindrome"));
	}
	
	
	
}
