package bankingapp;

import java.util.Scanner;
// needed to get user input

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		String name;
		double balance;
		int choice;
		double deposit;
		double withdrawl;

		System.out.println("Welcome to the Java Banking app!");

		System.out.println("Please enter account holder name");
		System.out.print("= ");

		name = input.nextLine();

		System.out.println("Enter your account balance");
		System.out.print("= ");

		balance = input.nextDouble();

		System.out.println("Your current account balance is = $" + balance);

		System.out.println("Please choose one of the following options; Deposit, Withdrawl or Log out");
		System.out.println("Deposit = 1");
		System.out.println("Withdrawl = 2");
		System.out.println("Log out = 3");

		System.out.print("Option Selected = ");
		choice = input.nextInt();

		if (choice == 1) {

			System.out.println("Deposit Selected");
			System.out.print("Enter total value of Deposit = ");
			deposit = input.nextDouble();

			balance += deposit;

			System.out.println("New balance after deposit is $" + balance);
		}

		else if (choice == 2) {

			System.out.println("Withdrawl Selected");
			System.out.print("Enter total value of Withdrawl = ");
			withdrawl = input.nextDouble();
			
			while (withdrawl > balance) {
				System.out.println("This will put your account at a overdrawn balance. Please choose an amount below or equal to your available balance");
				withdrawl = input.nextDouble();
			}

				balance -= withdrawl;
				System.out.println("New balance after Withdrawl is $" + withdrawl);
			}


		else if (choice == 3) {

			System.out.println("Logging off...");

		}
	
		else {
			
			System.out.println("Invalid Option Selected");
			
		}

	}

}
