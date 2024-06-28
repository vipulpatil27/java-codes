package TestJava;

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
		System.out.println("Display after conversion");
		for (int i = 0; i < ch.length; i++) {
			System.out.printf("%c", ch[i]);
		}
	}
}

public class UpperLowerStringApplication {

	public static void main(String[] args) {
		String data;
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the data");
		data = xyz.nextLine();
		char ch[] = data.toCharArray();
		ConvertToUpper c = new ConvertToUpper(ch);
		c.displayAfterConvert();
	}

}
