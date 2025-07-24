package Day5;

import Day5.CreditCardPayments;
import Day5.BillGenerator;
import Day5.UPIPayment;
public class MainApp {
	
	public static void main(String[] args) {
		CreditCardPayments creditCardPayments = new CreditCardPayments(1500);
		creditCardPayments.makePayment();
		
		UPIPayment upiPayment = new UPIPayment(2000);
		upiPayment.makePayment();
		
		
		BillGenerator.displayHeader();
		
		BillGenerator billGenerator = (amount) -> {
			System.out.println("Amount: " + amount);
			
			System.out.println("Thank you for the Payment");
		};
	}

}
