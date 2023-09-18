package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.AccountException;

public class PrincipalAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		System.out.println("Enter Account data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();

		System.out.print("Holder: ");
		String holder = sc.next();

		System.out.print("Initial Balance: ");
		double balance = sc.nextDouble();

		System.out.print("Withdraw Limit: ");
		double withdrawLimit = sc.nextDouble();

		Account objAccount = new Account(number, holder, balance, withdrawLimit);

		System.out.println("-----------------------------");
		System.out.print("Enter the amount to Withdraw: ");
		double amount = sc.nextDouble();

		try {
			objAccount.withdraw(amount);
			System.out.printf("New Ballance: %.2f%n", objAccount.getBalance());

		} catch (AccountException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}
