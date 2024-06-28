package PracticeProg2;
import java.util.*;

public class String_Palimdrome {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=xyz.nextLine();
		char ch[]=s.toCharArray();
		String s1="";
		int len=ch.length-1;
		int mid=len/2;
		for(int i=0;i<mid;i++)
		{
			char temp=ch[i];
			ch[i]=ch[len];
			ch[len]=temp;
			len--;
			s=new String(ch);
		}
		System.out.println(s);
		if(s.equals(s)) 
		{
			System.out.println("String is Palimdrome");
		}
		else
		{
			System.out.println("String is not Palimdrome");
		}
		
	}
}