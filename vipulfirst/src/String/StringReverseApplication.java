//reverse the string and words also.
package String;
import java.util.*;

public class StringReverseApplication {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the string");
		String str1 = xyz.nextLine();
		char ch[] = str1.toCharArray();
		int mid = str1.length() / 2;
		int end = str1.length() - 1;
		for (int i = 0; i < mid; i++) 
		{
			char temp = ch[i];
			ch[i] = ch[end];
			ch[end] = temp;
			end--;
		}
		for (int i = 0; i < ch.length; i++)
		{
			System.out.print(ch[i]);
		}
		// String temp=str1;
	}
}