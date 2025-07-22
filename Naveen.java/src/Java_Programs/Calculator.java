package Java_Programs;

import java.awt.im.InputContext;
import java.util.Scanner;

public class Calculator {
	
	public static void main(StringBuilder args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st Number: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter 2nd Number: ");
		double num2 = sc.nextDouble();
		
		double sum = num1+num2;
		double difference = num1-num2;
		double multiplication = num1*num2;
		double quotient = 0;
		
		if(num2!=0)
		{
			quotient = num1/num2;
		}
		else {
			System.out.println("Divided by 0 is not possible");
		}
		
		System.out.println("\nResults");
		System.out.println("Addition: "+ sum);
		System.out.println("Subtraction: "+difference);
		System.out.println("Multiplication: "+multiplication);
		if(num2!=0) {
			System.out.println("Division: "+quotient);
		}
        sc.close();
	}

}
