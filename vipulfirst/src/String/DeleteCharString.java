package String;
import java.util.*;
public class DeleteCharString {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=xyz.nextLine();
		char ch1[]=str1.toCharArray();
		String str2="";
		int length=ch1.length;
		System.out.println("Enter the character for deletion");
		char ch2=xyz.next().charAt(0);
		for(int i=0;i<ch1.length;i++)
		{
				if(ch1[i]!=ch2)
				{
					str2=str2+ch1[i];
				}
			}
		System.out.println(str2);
	}
}
