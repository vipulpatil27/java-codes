package PracticeProg1;
import java.util.*;

public class Reverse_String_removeVowels {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=xyz.nextLine();
		String str1="AEIOUaeiou";
		char ch[]=str.toCharArray();
		String str2="";	
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
		System.out.println("Display after the sorting");
		for(int i=0;i<ch2.length;i++)
		{
			System.out.print(""+ch2[i]);
		}
	}

}
