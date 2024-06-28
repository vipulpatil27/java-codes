package inheritence;

import java.util.*;

class ConvertToUpper {
	char ch[];

	ConvertToUpper(char ch[]) {
		this.ch = ch;
	}

	void displayAfterConvert() {
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) ((int) ch[i] - 32);
			}
		}

		System.out.println("Display after the conversion");
		for (int i = 0; i < ch.length; i++) {
			System.out.printf("%c", ch[i]);
		}
	}
}

class ConvertToLower {
	char ch[];

	ConvertToLower(char ch[]) {
		this.ch = ch;
	}

	void displayAfterConvert() {
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) ((int) ch[i] - 32);
			}
		}
		System.out.println("Display the after conversion");
		for (int i = 0; i < ch.length; i++) {
			System.out.printf("%c", ch[i]);
		}
	}
}

public class StringCasesApplication {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the choice");
		System.out.println("1: Convert to uppercase");
		System.out.println("2: Convert to lowercase");
		int choice = xyz.nextInt();
		xyz.nextLine();
		switch (choice) {
		case 1:
			String data;
			System.out.println("Enter the data");
			data = xyz.nextLine();
			char ch[] = data.toCharArray();
			ConvertToUpper c = new ConvertToUpper(ch);
			c.displayAfterConvert();
			break;
		case 2:
			System.out.println("Enter the data");
			data = xyz.nextLine();
			char ch1[] = data.toCharArray();
			ConvertToLower c1 = new ConvertToLower(ch1);
			c1.displayAfterConvert();
			break;
		default:
			System.out.println("Wrong choice");
		}
	}
}
