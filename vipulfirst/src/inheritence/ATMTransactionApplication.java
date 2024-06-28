package inheritence;

import java.util.*;

class Bank {
	static int acc_no = 10001;
	float amt;

	public void display() {
		System.out.println("Account no: " + acc_no);
		System.out.println("Current Amount: " + amt);
	}

	public Bank() {
		amt = 100;
		System.out.println("Ur account no is: " + acc_no);
		acc_no++;
	}

	public void getamount() {
		System.out.println("Current balance: " + amt);
	}

	public void withdraw(float x) {
		if (amt == 1000 || amt <= x) {
			System.out.println("\nSorry u cant withdraw the money");
		} else {
			amt = amt - x;
			System.out.println("amount widthdrwan: " + x);
			System.out.println("After witdhdrawl");
			getamount();
		}
	}

	public void deposite(float x) {
		if (x == 0) {
			System.out.println("\noops'sssss '0' can't be deposited");
		} else {
			amt += x;
			System.out.println("After deposition");
			getamount();
		}
	}
}

public class ATMTransactionApplication {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Bank b = new Bank();
		b.deposite(0);
		b.withdraw(1200);
		b.display();
		Bank b1 = new Bank();
		b1.deposite(100.5f);
		b1.withdraw(150.50f);
	}
}
