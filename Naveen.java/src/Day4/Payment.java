package Day4;

abstract class Payments {
	
	double amount; 
	
	Payments(double amount) {
		
		this.amount=amount;
		
	}
	
	abstract void makePayment();
	
	void display()
	{
		System.out.println("Payment Done Successfully "+ amount );
	}

}

class CreditCardPayment extends Payments
{
	
	CreditCardPayment(double amount) {
		super(amount);
		
	}
	
	void makePayment()
	{
		System.out.println("Credit Card Payment is Done.....");
	}
}

class UPIPayment extends Payments
{
	UPIPayment(double amount)
	{
		super(amount);
	}
	
	void makePayment()
	{
		System.out.println("UPI Payment is Done....");
	}
}


class COD extends Payments

{
	COD(double amount)
	{
		super(amount);
	}
	
	void makePayment()
	{
		System.out.println("Cash On Delivery ");
	}
}



public class Payment
{
	public static void main(String[] args) {
		Payments payments;
		payments= new CreditCardPayment(5000);
		payments.makePayment();
		System.out.println("Credit Card Payment Process is Completed....");
		
		payments = new UPIPayment(6000);
		payments.makePayment();
		System.out.println("UPI Payment Process is Completed.....");
		
		
		payments = new COD(7000);
		payments.makePayment();
		System.out.println("COD Payment Process is Completed.....");
		

		payments.display();
		
		
	}
}















