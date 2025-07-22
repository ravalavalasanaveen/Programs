package Day3;

import java.security.PrivateKey;

class SaleItem{

	private String productName ;
	private double price; 
	private int quantity; 
	
	public SaleItem(String productName, double price, int quantity)
	{
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
	}
	
	public double getTotalPrice() {
		return price*quantity;
	}
	
	public void displayItem()
	{
		System.out.println(productName + "\t"+ price + "\t" + quantity + "\t"+getTotalPrice());
	}
	
}

public class SalesSystem {
public static void main(String[] args) {
	
	SaleItem[] items = {
			
			new SaleItem("Laptop", 80000, 1),
			new SaleItem("KeyBoard", 2000, 1),
			new SaleItem("Mouse", 1000, 1),	
	};
	
	double grandTotal=0; 
	System.out.println("Product \t Price \t Quantity Total");
	
	System.out.println("-------------------------------------------");
	
	for(SaleItem item: items)
	{
		item.displayItem();
		grandTotal+=item.getTotalPrice();
	}
	
	System.out.println("---------------------------------------------");
	
	System.out.println("Grand Total: \t\t"+ grandTotal);
	
}
}
