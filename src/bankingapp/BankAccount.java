package bankingapp;

public class BankAccount  {

	String name;
	double balance;
	
	public BankAccount (String accountName, double startingBalance) {
		
		name = accountName;
		balance = startingBalance;
		
	}
	
	public void deposit(double amount) {
			
			balance += amount;

	}
	
	public void withdrawl(double amount) {
		
		if (amount <= balance) {
			
			balance -= amount;

		}
		
	}
	
	public void TransferToSavings(BankAccount other,double amount ) {
		
		balance -= amount;
		other.deposit (amount);
		
	}
	
		
	public double getBalance() {
		
		return balance;
		
		
	}
}
