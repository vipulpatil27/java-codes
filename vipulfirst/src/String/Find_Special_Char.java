//--Find Special Character
package String;
import java.util.*;

public class Find_Special_Char {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=xyz.nextLine();
		boolean b=false;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=122 || str.charAt(i)<=66)
			{
				b=true;
			}
		}
		if(b)
		{
			System.out.println("Found ");
		}
		else
		{
			System.out.println("Not found");
		}
	}
}
