package PracticeProg1;
import java.util.*;

public class RemoveSpacesString {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=xyz.nextLine();
		char ch[]=str.toCharArray();
		String str1=" ";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				str1=str1+ch[i];
			}
		}
		System.out.println("After the removing the white spaces:\n "+str1);
	}
}
