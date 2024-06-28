package PracticeProg1;
import java.util.*;

public class String_First_Capital {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=xyz.nextLine();
		String str1=" ";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				count++;
				str1=str1+ch;
			}
		}
		System.out.println("The capital letters are:"+str1+" --> "+count);
	}
}
