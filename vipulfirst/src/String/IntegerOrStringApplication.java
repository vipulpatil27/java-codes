package String;

import java.util.*;

class FindIntegerString 
{
	private String s;

	public void acceptString(String s) 
	{
		this.s = s;
	}

	public boolean findString() 
	{
		boolean b = true;
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if (ch[i] <= '9' && ch[i] >= '0')
			{

			}
			else 
			{
				b = false;
				break;
			}
		}
		return b;
	}
}

public class IntegerOrStringApplication {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the string value");
		String s = xyz.nextLine();
		FindIntegerString f = new FindIntegerString();
		f.acceptString(s);
		boolean b = f.findString();
		if (b)
		{
			System.out.println("\nGiven string is a Integer String");
		}
		else 
		{
			System.out.println("\nGiven string is not a integer String");
		}
	}
}
