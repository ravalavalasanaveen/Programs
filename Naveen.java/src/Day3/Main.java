package Day3;

public class Main {
	
	public static void main(String[] args) {
		BankAccountProject account = new BankAccountProject("Ram", 80000);
		account.deposit(5000);
		account.withdraw(2000);
		account.display();
	}

}
