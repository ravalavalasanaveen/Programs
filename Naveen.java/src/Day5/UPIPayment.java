package Day5;

public class UPIPayment extends Payment {

public UPIPayment(double amount)
{
	super(amount);
}

@Override
public void makePayment()
{
	System.out.println("Processing the UPI Payment...");
	printReceipt();
}

	
	
}
