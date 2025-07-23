package Day4;

interface EcommercePayment{
	void makePayment();
}


abstract class PaymentSys implements EcommercePayment
{
	double amount;
	
	PaymentSys(double amount) {
		this.amount=amount;
	}
	
	void display()
	{
		System.out.println("Payment is Successful "+amount);
	}
	
}


class DebitCardPayment extends PaymentSys 

{
	 DebitCardPayment(double amount) {
		super(amount);
	}
	 
	 public void makePayment()
	 {
		 System.out.println("Debit Card Payment is Done...");
		 display();
	 }
}

class NetBanking extends PaymentSys
{
	public NetBanking(double amount) {
		
		super(amount);
		
	}
	
	public void makePayment()
	{
		System.out.println("Net Banking Payment is Done...");
		display();
	}
}


public class PaymentSystem 
{
	public static void main(String[] args) {
		
		PaymentSys paymentSys; 
		paymentSys= new DebitCardPayment(50000);
		paymentSys.makePayment();
		
		paymentSys = new NetBanking(80000);
		paymentSys.makePayment();
		
	}

}
