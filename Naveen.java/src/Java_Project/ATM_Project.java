package Java_Project;

import java.util.Scanner;

public class ATM_Project {
	
	private double balance;
	private Scanner scanner; 
	
	public ATM_Project()
	{
		balance=1000.0;
		scanner = new Scanner(System.in);
	}
	
	public void displayMenu()
	{
		// to show options to the users
		System.out.println("ATM Menu");
		System.out.println("1. Check Balance ");
		System.out.println("2. Deposit");
		System.out.println("3. WithDraw");
		System.out.println("4. Exit");
	}
	
	public void checkBalance()
	{
		System.out.println("Your Balance is $"+ balance);
	}
	
	public void deposit()
	{
		
		System.out.println("Enter the amount to deposit $");
		
		double amount = scanner.nextDouble();
		if (amount>0) {
			balance+=amount;
			System.out.println("$"+ amount + " has been deposited" );
			
		}
		
		else { 
			System.out.println("Invalid amount please add positive amount");
			
		}
		
	}
	
	public void withdraw()
	{
		System.out.println("Enter the amount to withdraw");
		
		double amount = scanner.nextDouble();
		if (amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("$" + amount + "has been withdrawn");
			
		}
		
		else if (amount> balance) {
			System.out.println("Insufficient funds. Your balance is $" + balance);
			
		}
		
		else {
			System.out.println("Invalid amount please enter a positive amount");
		}
		
	}
	
	public static void main (String[] args)
	{
		ATM_Project atm = new ATM_Project();
		
		while(true) // ATM is initiated
		{
			atm.displayMenu();
			
			System.out.println("Enter Your Choice");
			int choice = atm.scanner.nextInt();
			
			
			switch (choice) {
			case 1:
				atm.checkBalance();
				break;

			case 2:
				atm.deposit();
				break;
			case 3:
				atm.withdraw();
				break;
			case 4:
				System.out.println("Thank you for using ATM, Good Bye");
				break;
			
			default:
				System.out.println("Invalid Choice");
			}
		}
		
	}

}
