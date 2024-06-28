package String;

import java.util.*;

public class VowelConsonatCountAppliction {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string");
		String  str=xyz.nextLine();
		char str1[]=str.toCharArray();
		int Vcount=0,Ccount=0;
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i]=='a' || str1[i]=='e' || str1[i]=='i' || str1[i]=='o' || str1[i]=='u' ||
			   str1[i]=='A' || str1[i]=='E' || str1[i]=='I' || str1[i]=='O' || str1[i]=='U')
			{
				Vcount++;
			}
			else
			{
				Ccount++;
			}
		}
		System.out.printf("\nThe vowels are :%d",Vcount);
		System.out.printf("\nThe consonants are: %d", Ccount);
	}

}
