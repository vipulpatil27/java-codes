package PracticeProg1;
import java.util.*;

public class RemoveSpacesReverseString {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string ");
		String s=xyz.nextLine();
		String s1=" ";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				s1=s1+ch[i];
			}
		}
		System.out.println("After removing the white spaces: "+s1);
		char ch1[]=s1.toCharArray();
		int end=ch1.length-1;
		int mid=end/2;
		for(int i=0;i<mid;i++)
		{
			char temp=ch1[i];
			ch1[i]=ch1[end];
			ch1[end]=temp;
			end--;
		}
		System.out.println("After the reversing it: ");
		for(int i=0;i<ch1.length;i++)
		{
			System.out.print(""+ch1[i]);
		}
	}
}