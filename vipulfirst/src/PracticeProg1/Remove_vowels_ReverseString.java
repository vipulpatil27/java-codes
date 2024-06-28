package PracticeProg1;
import java.util.*;

public class Remove_vowels_ReverseString {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=xyz.nextLine();
		String str1="AEIOUaeiou";
		String str2=" ";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			boolean b=false;
			for(int j=0;j<str1.length();j++)
			{
				char ch1=str1.charAt(j);
				if(ch[i]==ch1)
				{
					b=true;
				}
			}
			if(b)
			{
				continue;
			}
			else
			{
				str2=str2+ch[i];
			}
		}
		//Reverse logic
		char ch2[]=str2.toCharArray();
		int end=ch2.length-1;
		int mid=end/2;
		for(int i=0;i<mid;i++)
		{
			char temp=ch2[i];
			ch2[i]=ch2[end];
			ch2[end]=temp;
			end--;
		}
		System.out.println("Dispaly after the remove the vowels and reverse the string");
		for(int i=0;i<ch2.length;i++)
		{
			System.out.print(ch2[i]);
		}
	}
}