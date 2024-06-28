package String;

import java.util.*;

public class Reverse_Char_String {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str1 = xyz.nextLine();
		String str2[] = str1.split("");
		String str3 = "";
		for (int i = 0; i < str2.length; i++) {
			char ch[] = str1.toCharArray();
			int end = ch.length - 1;
			int mid = end / 2;
			for (int j = 0; j < mid; j++) {
				char temp = ch[j];
				ch[j] = ch[end];
				ch[end] = temp;
				end--;
			}
			for (int j = 0; j < ch.length; j++) {
				str3 = str3 + ch[j];
			}
			str3 = str3 + "";
		}
		System.out.println(str3);
	}
 }