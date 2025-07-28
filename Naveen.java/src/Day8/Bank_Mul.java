package Day8;

public class Bank_Mul 
{
	private double balance; 
	
	public Bank_Mul(double initial_Balance)
	{
		this.balance = initial_Balance;
	}
	
	// Synchronized Method For deposit 
	// Synchronized means only one thread can run this method at a time , to prevent errors
	
	public synchronized void deposit(double amount)
	{
		balance+=amount;
		System.out.printf("%s deposited : %.2f, Balance: %.2f%n", 
				Thread.currentThread().getName(),amount,balance);
	}
	
	public synchronized void withdraw(double amount)
	{
		if(balance>=amount)
		{
			balance-=amount;
			System.out.printf("%s withdraw : %.2f, Balance: %.2f%n", 
					Thread.currentThread().getName(),amount,balance);
		}
		
		else 
		{
			System.out.printf("%s Insufficient Funds for withdraw : %.2f, Balance: %.2f%n", 
					Thread.currentThread().getName(),amount,balance);
		}
	}
	
	public double getBalance()
	{
		return balance;
	}

}
