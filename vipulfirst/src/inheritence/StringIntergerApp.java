package inheritence;
import java.util.*;

class StringParent
{
	char ch[]=new char[5];
	void setValue(char ch[])
	{
		this.ch=ch;
	}
}
class FindInteger extends StringParent
{
	void findInteger()
	{
		boolean flag = false;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='1'  &&  ch[i]<='9')
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
	}
}
public class StringIntergerApp {

	public static void main(String[] args) {
		Scanner xyz= new Scanner (System.in);
		System.out.println("Enter the values");
		StringParent s=new StringParent();
		FindInteger f=new FindInteger();
		String str="str";
		char[] ch =str.toCharArray();
		f.setValue(ch);
		f.findInteger();

	}

}
