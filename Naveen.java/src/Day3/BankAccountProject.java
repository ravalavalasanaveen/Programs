package Day3;

public class BankAccountProject {

	private String accountHolder; 
	private double balance; 
	
	public BankAccountProject(String accountHolder, double balance) {
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	
	public void deposit(double amount)
	{
		balance+=amount;
		System.out.println(amount+ " is deposited Successfully. New Balance is: "+ balance);
	}
	
	public void withdraw(double amount) {
		if(amount>balance)
		{
			System.out.println("Insuffcient Funds");
		}
		
		else if(amount==0)
		{
			System.out.println("Please enter amount grater than 0");
		}
		else {
			balance-=amount;
			System.out.println(amount+ " is successfully withdrawn. Remaining balance: "+ balance);
		}
		
	}
	
	public void display() {
		System.out.println("Account Holder: "+ accountHolder);
		System.out.println("Balance: "+ balance);
		
	}
}
