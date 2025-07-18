package Java_Programs;

import java.util.Scanner;

public class UserInputDataType {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = sc.nextLine(); // Reference data type 
		// it stores the value entered from the keyboard 
		System.out.println("Enter your score(int):");
		int score = sc.nextInt();
		System.out.println("Enter your Height (Double)");
		double height = sc.nextDouble();
		System.out.println("\nHello, "+ name);
		System.out.println("Score: "+score);
		System.out.println("Height: "+height);
	}

}
