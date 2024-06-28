package String;
import java.util.*;

public class practice {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=xyz.nextLine();
		String s2="aeiouAEIOU";
		String s3=" ";
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			boolean b=false;
			for(int j=0;j<s2.length();j++) 
			{
				char ch2=s2.charAt(j);
				if(ch[i]==ch2)
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
				s3=s3+ch[i];
			}
		}
		char ch2[]=s3.toCharArray();
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
			System.out.println(ch2[i]);
		}
	}
}