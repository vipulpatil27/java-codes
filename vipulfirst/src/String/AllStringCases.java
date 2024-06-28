package String;
import java.util.*;

abstract class A {
	void StringOperation(String x) {
	}
}

class UpperCase extends A {
	void StringOperation(String x) {
		char ch[] = x.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) ((int) ch[i - 32]);
			}
		}
		System.out.println("After conversion of the string");
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}
}

class LowerCase extends A{
	void StringOperation(String x) {
		char ch[]=x.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] >='A'  &&  ch[i]<='Z' )
			{
				ch[i]=(char)((int) ch[i-32]);
			}
		}
		System.out.println("After conversion of the string");
		{
			for(int i=0;i<ch.length;i++)
			{
				System.out.println(ch[i]);
			}
		}
	}
}
class DescendingOrder extends A{
	void StringOperation(String x)
	{
		char ch[]=x.toCharArray();
		char temp;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=(i+1);i<ch.length;j++)
			{
				if(ch[i]<ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println("After the conversion the of string in descendng order");
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}
}
class Ascending extends A{ 
	void StringOperation(String x) {
		char ch[]=x.toCharArray();
		char temp;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=(i+1);j<ch.length;i++)
			{
				if(ch[i]>ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println("After the conversion in ascending order");
		{
			for(int i=0;i<ch.length;i++)
			{
				System.out.println(ch[i]);
			}
		}
	}
}
public class AllStringCases {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the choice");
		System.out.println("\n1: Convert to uppercase");
		System.out.println("2: Convert to Lowercase");
		System.out.println("3: Descending order");
		System.out.println("4: Ascending order");

		System.out.println("Enter the String");
		String str=xyz.nextLine();
		System.out.println("Enter the choice");
		int choice=xyz.nextInt();
		switch(choice) {
		case 1:
			UpperCase u=new UpperCase();
			u.StringOperation(str);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			System.exit(0);
			default:
			{
				System.out.println("Wrong choice");
			}
		}
		

	}

}
