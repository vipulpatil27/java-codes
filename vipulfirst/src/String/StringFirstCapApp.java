package String;
import java.util.*;

public class StringFirstCapApp {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		String str1 = " ";
		System.out.println("Enter the string");
		String str = xyz.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // string converted to char array
			if (ch >= 'A' && ch <= 'Z') // logic for count the capital letters in String
			{
				count++;
				str1 = str1 + ch;
			}
		}
		System.out.println("The capital letters are:" + str1 + " " + count);
	}
}
