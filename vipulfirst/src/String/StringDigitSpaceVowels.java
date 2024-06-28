package String;

import java.util.*;

public class StringDigitSpaceVowels {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the string");
		String str1 = xyz.nextLine();
		System.out.println("\nDisplay the string: " + str1);
		char str2[] = str1.toCharArray();
		int Vcount = 0, Digit = 0, Spaces = 0,Ccount=0;
		
		for (int i = 0; i < str1.length(); i++) 
		{
			if (str2[i] == 'a' || str2[i] == 'e' || str2[i] == 'i' || str2[i] == 'o' || str2[i] == 'u' || str2[i] == 'A'
			 || str2[i] == 'E' || str2[i] == 'I' || str2[i] == 'O' || str2[i] == 'U')
			{
				Vcount++;
			} 
			else if (str2[i] >= 48 && str2[i] <= 57)
			{
				Digit++;
			}
			else if (str2[i] == ' ')
			{
				Spaces++;
			}
			else
			{
				Ccount++;
			}
		}
		System.out.println("\nVowels are: " + Vcount);
		System.out.println("\nConsonants are:" + Ccount);
		System.out.println("\nDigits are:" + Digit);
		System.out.println("\nSpaces are:" + Spaces);
	}
}
