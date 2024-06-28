package String;

import java.util.*;

class FindMultipleOfTen {
	private String str;

	public void acceptString(String str) {
		this.str = str;
	}

	public boolean findString() {
		boolean b = true;
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] <= '9' && ch[i] >= '0') {

			} else {
				b = false;
				break;
			}
		}
		return b;
	}

	public void findMultipleOfTen() {
		char ch[] = str.toCharArray();
		int no = 0;
		for (int i = 0; i < ch.length; i++) {
			no = no * 10 + (int) ch[i] - 48;
		}
		if (no % 10 == 0) {
			System.out.println("No multiple of ten is: " + no);
		} else {
			int r = no % 10;
			no = no + (10 - r);
			System.out.println("No multiple of ten is : " + no);
		}
	}
}

public class NearestNumberTo10App {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the positive integer value");
		String str = xyz.nextLine();
		FindMultipleOfTen f = new FindMultipleOfTen();
		f.acceptString(str);
		boolean b = f.findString();
		if (b) {
			f.findMultipleOfTen();
		} else {
			System.out.println("Given input is not a  integer value");
		}
	}
}
