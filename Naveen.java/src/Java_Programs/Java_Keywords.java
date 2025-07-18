package Java_Programs;

import java.util.Scanner;

public class Java_Keywords 
{
	public static void main(String[] args)
	{
		//Keywords : Public , static , void are keywords 
		
		Scanner sc = new Scanner(System.in);
//		Key words are : new and the class name "Scanner"
		System.out.println("Enter First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();
		int Sum= a+b;
		System.out.println("Sum: "+ Sum);
		sc.close();
		
	}

}
