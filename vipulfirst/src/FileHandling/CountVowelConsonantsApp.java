package FileHandling;

import java.io.*;

public class CountVowelConsonantsApp {

	public static void main(String[] args) throws Exception{
		int Vcount=0,Ccount=0;
		FileReader fr=new FileReader("D:\\aug2022\\firstfile.text");
		BufferedReader br=new BufferedReader(fr);
		int data;
		while((data=fr.read())!=-1)
		{
			System.out.println((char)data);
			if((char)data=='a' || (char)data=='e' || (char)data=='i' || (char)data=='o' ||(char)data=='u')
			{
				Vcount++;
			}
			else if((char)data >= 'a'  &&  (char)data <='z')
			{
				Ccount++;
			}
		}
		System.out.println("Vowels are: "+Vcount);
		System.out.println("Consonants are: "+Ccount);
	}
}