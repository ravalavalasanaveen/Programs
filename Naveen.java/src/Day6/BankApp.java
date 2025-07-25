package Day6;

import java.util.Scanner;

public class BankApp 
{
	public static void main(String[] args) 
	{
		
		
		BankDemo bankDemo = new SavingsAccount(1000);
		
		bankDemo.displayAccountType();
		
		bankDemo.executeTransaction("deposit", 500);
		
		bankDemo.executeTransaction("withdraw", 100);
		
		System.out.println("Final Balance "+ bankDemo.getBalance());
		
		
	}

}
