package String;
import java.util.*;

public class Remove_Vowels_Reverse_String {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the stirng");
		String str1=xyz.nextLine();
		String str2="AEIOUaeiou";
		String str3=" ";
		char ch[]=str1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			boolean b=false;
			for(int j=0;j<str2.length();j++)
			{
				char ch1=str2.charAt(j);
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
				str3=str3+ch[i];
			}
		}
		char ch2[]=str3.toCharArray();
		int end=ch2.length-1;
		int mid=end/2;
		for(int i=0;i<mid;i++)
		{
			char temp=ch2[i];
			ch2[i]=ch2[end];
			ch2[end]=temp;
			end--;
		}
		for(int i=0;i<ch2.length;i++)
		{
			System.out.print(ch2[i]);
		}
	} 
}