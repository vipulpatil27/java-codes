package String;
import java.util.*;

public class MaxOccurChar {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=xyz.nextLine();
		int [] charCount=new int[200];
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			charCount[ch]++;
		}
		
		int maxCount=0;
		char maxChar=' ';
		for(int i=0;i<charCount.length;i++)
		{
			if(charCount[i]>maxCount)
			{
				maxCount=charCount[i];
				maxChar=(char)i;
			}
		}
		System.out.println("Maximum occuring character in string is "+maxChar+" with repeatation "+maxCount);
	}
}
