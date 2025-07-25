package Day6;

public class SavingsAccount implements BankDemo 
{
	private double balance; 
	
	public SavingsAccount(double balance)
	{
		this.balance = balance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double amount)
	{
		balance+=amount;
	}
	
	public void withDraw(double amount)
	{
		if(balance >=amount)
		{
			balance-=amount;
		}
		
		else {
			System.out.println("Insufficent Funds to withdraw $ "+amount);
		}
	}
	
	
	public void displayAccountType()
	{
		System.out.println("Account Type: Savings Account");
	}

}
