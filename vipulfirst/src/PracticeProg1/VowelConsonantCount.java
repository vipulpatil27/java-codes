package PracticeProg1;
import java.util.*;

public class VowelConsonantCount {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=xyz.nextLine();
		char ch[]=str.toCharArray();
		int Vcount=0,Ccount=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U' || 
			   ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				Vcount++;
			}
			else
			{
				Ccount++;
			}
		}
		System.out.printf("The Vowels are %d: ",Vcount);
		System.out.printf("The Consonants are %d: ",Ccount);
	}
}
