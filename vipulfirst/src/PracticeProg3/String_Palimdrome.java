package PracticeProg3;
import java.util.*;

public class String_Palimdrome {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=xyz.nextLine();
		boolean b=true;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
			{
				b=false;
				break;
			}
		}
		if(b)
		{
			System.out.println("String is palimdrome");
		}
		else
		{
			System.out.println("String is not palimdrome");
		}
	}
}