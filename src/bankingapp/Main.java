package bankingapp;

import java.util.Scanner;
// needed to get user input

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		String name; 
		double balance;
		double savingsbalance;
		int choice = 0;
		double deposit;
		double withdrawl;
		double transferamount;
		
		
		System.out.println("==================================");
		System.out.println(" Welcome to the Java Banking app! ");
		System.out.println("==================================");
		System.out.println();
		System.out.println();

		System.out.print("Please enter account holder name = ");
		System.out.println();

		name = input.nextLine();
		System.out.println();

		System.out.print("Enter your chequing account balance = ");
		System.out.println();
		
		balance = input.nextDouble();
		System.out.println();

		System.out.print("Enter your savings account balance = ");
		System.out.println();
		
		savingsbalance = input.nextDouble();
		System.out.println();
		
		BankAccount acc1 = 
				new BankAccount( "Chequing", balance);
		
		BankAccount acc2 = 
				new BankAccount( "Savings", savingsbalance );

		System.out.println("Current Chequing account balance: $" + acc1.getBalance());
		System.out.println();
		
		System.out.println("Current Savings account balance: $" + acc2.getBalance());
		System.out.println(); 
		
		while (choice != 5) {

		System.out.println(" Please choose one of the following options:");
		System.out.println("_--------------------------------------------");
		System.out.println("Deposit 						= 1");
		System.out.println("Withdrawl 						= 2");
		System.out.println("Transfer to Chequing Account				= 3");
		System.out.println("Transfer to Saving Account 				= 4");
		System.out.println("Log out 						= 5");
		System.out.println();

		System.out.print("Option Selected = ");
		choice = input.nextInt();
		System.out.println();
		

		if (choice == 1) {

			System.out.println("======Deposit======");
			System.out.println();
			System.out.print("Enter total value of Deposit = ");
			deposit = input.nextDouble();
			System.out.println();

			acc1.deposit(deposit);

			System.out.println("New balance after deposit is $" + acc1.getBalance());
			System.out.println();
		}

		else if (choice == 2) {

			System.out.println("======Withdrawl======");
			System.out.println();
			System.out.print("Enter total value of Withdrawl = ");
			withdrawl = input.nextDouble();
			System.out.println();
			
			while (withdrawl > acc1.getBalance()) {
				System.out.println("This will put your account at a overdrawn balance. Please choose an amount below or equal to your available balance");
				withdrawl = input.nextDouble();
			}

				acc1.withdrawl(withdrawl);
				System.out.println("New balance after Withdrawl is $" + acc1.getBalance());
				System.out.println();
			}


		else if (choice == 3) {

			System.out.println("======Transfer to Chequing======");
			System.out.println();
			System.out.print("Enter total value of transfer = ");
			transferamount = input.nextDouble();
			System.out.println();
			
			while (transferamount > acc2.getBalance()) {
				
				System.out.println("Invalid Option Selected");
				System.out.println();
				
				System.out.print("Enter total value of transfer = ");
				transferamount = input.nextDouble();
				System.out.println();
				
			}
			acc1.deposit(transferamount);
			acc2.withdrawl(transferamount);
			
			
			System.out.println("New Chequing account balance: $" + acc1.getBalance());
			System.out.println("New Savings account balance:  $" + acc2.getBalance());
			System.out.println();
			
		}
		
		else if (choice == 4) {
			
			System.out.println("======Transfer to Saving======");
			System.out.println();
			System.out.print("Enter total value of transfer = ");
			transferamount = input.nextDouble();
			System.out.println();
			
			while (transferamount > acc1.getBalance()) {
				
				System.out.println("Invalid Option Selected");
				System.out.println();
				
				System.out.print("Enter total value of transfer = ");
				transferamount = input.nextDouble();
				System.out.println();
				
			}
			
			acc2.deposit(transferamount);
			acc1.withdrawl(transferamount);
			
			System.out.println("New Chequing account balance: $" + acc1.getBalance());
			System.out.println("New Savings account balance:  $" + acc2.getBalance());
			System.out.println();
		}
		
		else if (choice == 5) {
			
			System.out.println("Logging off...");
			System.out.println();

		}
		
		
		
		else {
			
			System.out.println("Invalid Option Selected");
			System.out.println();
			
		}

	}
		
	}

}
