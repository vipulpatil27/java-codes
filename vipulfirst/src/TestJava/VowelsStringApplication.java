//Count the vowels  and consonants
package TestJava;

import java.util.*;

interface A {                           			//interface class
	void acceptString(String str);
}

class CountVowels implements A {					//implementor  class
	private String str;

	public void acceptString(String str) {
		this.str = str;
	}

	public void getVowelCount() {
		{
			int Vcount = 0, Ccount = 0;
			char[] str1 = str.toCharArray();
			for (int i = 0; i<str1.length; i++) {
				if (str1[i] == 'a' || str1[i] == 'e' || str1[i] == 'i' || str1[i] == 'o' || str1[i] == 'u'
				 || str1[i] == 'A' || str1[i] == 'E' || str1[i] == 'I' || str1[i] == 'O' || str1[i] == 'U') {
					Vcount++;
				} else {
					Ccount++;
				}
			}

			System.out.printf("\nNumber of vowels is : %d\n" , Vcount);
			System.out.printf("\nNumber of consonants is : %d\n" , Ccount);
		}
	}

}

public class VowelsStringApplication {           //main class 

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
    	System.out.println("Enter the string values\n");
    	String str=xyz.nextLine();
    	CountVowels c=new CountVowels();
    	c.acceptString(str);
    	c.getVowelCount();
	}
}
