package TestJava;

import java.util.*;

abstract class NumberOperation {
	int no;

	void setValue(int no) {
		this.no = no;
	}

	abstract void getDigitCount();
}

class DigitCount extends NumberOperation {
	int no;
	int count = 0;
	int rem;

	public void setValue(int no) {
		this.no = no;
	}

	public void getDigitCount() {
		while (no > 0) {
			rem = no % 10;
			count++;
			no = no / 10;
		}
		System.out.println("digit count is= " + count);
	}
}

class SearchDigit extends NumberOperation {
	int no;
	int digit, rem, flag = 0;
	Scanner S = new Scanner(System.in);

	public void setValue(int no) {
		this.no = no;
	}

	public void getDigitCount() {
		System.out.println("enter the digit you want to search");
		digit = S.nextInt();

		while (no > 0) {
			rem = no % 10;
			no = no / 10;
			if (rem == digit) {
				flag = 1;
				break;
			}

		}
		if (flag == 1) {
			System.out.println("digit found");
		} 
		else 
		{
			System.out.println("digit not found");
		}

	}
}

public class AbstractApplication {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("enter the number");
		int no = xyz.nextInt();
		DigitCount d = new DigitCount();
		d.setValue(no);
		d.getDigitCount();
		SearchDigit s = new SearchDigit();
		s.setValue(no);
		s.getDigitCount();
	}
}