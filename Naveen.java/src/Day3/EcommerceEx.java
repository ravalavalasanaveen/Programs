package Day3;

interface PaymentMode{
	void pay(double amount); // This is automatically "public" and "abstract"
	
	// In interface all methods are public and abstract 
}

class UPIPayment implements PaymentMode{
	
	//Here we are implementing a method from the an interface , which is public by default 
	
	//Even though the method in the interface is public by default, 
	// when you write the method in the class, Java checks visibility (access modifier) strictly.
	
	public void pay(double amount)
	{
		System.out.println("Paid $ "+ amount + " via UPI.");
	}
}

class CreditCardPayment implements PaymentMode {
	public void pay(double amount)
	{
		System.out.println("Paid $ "+ amount+" using Credit Card");
	}
}

class CashOnDelivery implements PaymentMode{
	public void pay(double amount) {
		
		System.out.println("Paid $ "+ amount+ " using Cash On Delivery");
		
	}
}

public class EcommerceEx {
	public static void main(String[] args) {
		
		PaymentMode paymentMode;
		
		paymentMode = new UPIPayment();
		paymentMode.pay(1500.0);
		
		paymentMode = new CreditCardPayment();
		paymentMode.pay(2000.0);
		
		paymentMode = new CashOnDelivery();
		paymentMode.pay(2500.0);
		
		
		
	}

}
