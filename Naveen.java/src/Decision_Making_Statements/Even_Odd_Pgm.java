package Decision_Making_Statements;

import java.util.Scanner;

public class Even_Odd_Pgm {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = scanner.nextInt();
		
		String result = (a%2==0)?"Even":"Odd";
		System.out.println(result);
		
		
	}

}
