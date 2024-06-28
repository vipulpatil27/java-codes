package String;
import java.util.*;

public class RemoveSpacesString {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string");
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
		System.out.println("After removing the white spaces:"+"\n"+s1);
	}
}
