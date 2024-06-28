package PracticeProg2;
import java.util.*;

public class String_Occurennces {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=xyz.nextLine();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=(i+1);j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		int count=1;
		for(int i=0;i<ch.length;i++)
		{
			if(i==ch.length-1)
			{
				System.out.println(ch[i]+" Occures: "+count);
			}
			else if(ch[i]==ch[i+1])
			{
				count++;
			}
			else
			{
				System.out.println(ch[i]+" Occures: "+count);
				count=1;
			}
		}
	}
}
