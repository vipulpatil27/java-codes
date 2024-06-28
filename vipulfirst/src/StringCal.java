import java.util.*;

public class StringCal {
	public static void main(String[] args) {
		String str="Vipul_123_patil_789";
		String s[]=str.split("");
		int sum=0;
		for(String abc:s) {
			int count=0;
			for(int i=0;i<abc.length();i++)
			{
				if((48<=abc.charAt(i)) && (57>=abc.charAt(i)))
				{
					count++;
				}
			}
			if(count==abc.length())
			{
				sum=sum+Integer.parseInt(abc);
			}
		}
		System.out.println("Sum is "+ sum);
	}
}
