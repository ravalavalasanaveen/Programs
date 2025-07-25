package Day6;

public interface BankDemo
{
	double getBalance();
	void deposit(double amount);
	void withDraw(double amount);
	
	default void  displayAccountType()
	{
	    System.out.println("Account Type : Generic Bank Acccount");
	    
	}
	
	
	static boolean isValid(double amount)
	{
		return amount>0;
	}
	
	default void executeTransaction(String type, double amount)
	{
		if(!BankDemo.isValid(amount))
		{
			System.out.println("Invalid Amount: "+ amount);
			return;
		}
		
		switch(type.toUpperCase()) {
		
		case "DEPOSIT":
			deposit(amount);
		System.out.println("Sucessfully Deposited $ "+ amount + ". New Balance $ " + getBalance());
		break;
		
		case "WITHDRAW":
			withDraw(amount);
			System.out.println(amount + " Withdraw successfuly" + ". New Balance $ "+ getBalance());
			break; 
			
		default:
			System.out.println("Unknown transaction type: "+ type);
			
			
		}
	}
	
	

}
