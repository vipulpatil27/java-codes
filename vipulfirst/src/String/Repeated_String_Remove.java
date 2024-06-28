package String;
import java.util.*;
public class Repeated_String_Remove {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size of String Array :");
	int size=sc.nextInt();
	
	String s[] = new String[size+2];
	
	System.out.println("Enter the Strings :");
	for(int i=0;i<s.length-1;i++)
	{
		s[i]=sc.nextLine();
	}
	
	for(int i=0;i<s.length-1;i++)
	{
		System.out.println(s[i]);
	}
	int count=1;
	for(int i=0;i<s.length-1;i++)
	{
		if(s[i]!=s[i+1])
		{
			++count;
		}
		else
		{
			System.out.println(s[i]);
			count=1;
		}
	}

	}

}
