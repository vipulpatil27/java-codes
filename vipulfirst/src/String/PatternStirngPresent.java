package String;

import java.util.*;

public class PatternStirngPresent {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str1=xyz.nextLine();
		System.out.println("Display the string\n: "+str1);
		char str2[]=str1.toCharArray();
		boolean b=str1.contains("at");
		if(b)
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Not present");
		}
	}

}