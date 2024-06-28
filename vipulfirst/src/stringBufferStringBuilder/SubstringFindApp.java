package stringBufferStringBuilder;

import java.util.*;

public class SubstringFindApp {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str1=xyz.nextLine();
		char str2[]=str1.toCharArray();
		int count=0;
		boolean b=str1.contains("at");
		for(int i=0;i<str1.length();i++)
			if(b)
			{
				System.out.println("Present");
				
			}
			else
			{
				System.out.println("no");
			}

	}

}
