package PracticeProg1;
import java.util.*;
public class StringDigitSpaceConVowels {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=xyz.nextLine();
		System.out.println("\nDisplay the string:\n"+str);
		char ch[]=str.toCharArray();
		int Vcount=0,Ccount=0,Digit=0,Space=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' 
			|| ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='o' || ch[i]=='U')
			{
				Vcount++;
			}
			else if(ch[i]>=48 && ch[i]<=57)
			{
				Digit++;
			}
			else if(ch[i]==' ')
			{
				Space++;
			}
			else
			{
				Ccount++;
			}
		}
		System.out.println("\nDispaly the Vowels: "+Vcount);
		System.out.println("Dispaly the Consonants: "+Ccount);
		System.out.println("Dispaly the Digits: "+Digit);
		System.out.println("Dispaly the Spaces: "+Space);
		
		
		
	}

}
