import java.util.*;

public class StringCall {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=xyz.nextLine();
		String string[]=s.split(" ");
		int sum=0;
		int val=0;
		for(int i=0;i<s.length();i++)
		{
			if(CheckisDigitSum(string[i]))
			{
				val=Integer.valueOf(string[i]);
				System.out.println(val);
				sum=sum+val;
			}
		}
		System.out.println("Sum of string is: "+sum);
	}

	private static boolean CheckisDigitSum(String string) {
		try 
		{
			Integer val=Integer.valueOf(string);
			return true;
		}
		catch(Exception ex);
		{
			return false;
		}
	}
}
