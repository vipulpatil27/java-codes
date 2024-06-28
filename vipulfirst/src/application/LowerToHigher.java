package application;
import java.util.*;

class LowerToHigherApp
    {
	char ch[];
	public void setCharArray(char ch[])
	{
		this.ch=ch;
	}
	void LowerToHigherCase()
	{
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>'a'  && ch[i]<'z')
			{
				ch[i]=(char)((int)ch[i]-32);
			}
		}
			System.out.println("display after conversion");
			for(int i=0;i<ch.length;i++)
			{
				System.out.printf("%c",ch[i]);
			}
	}
}
public class LowerToHigher {
  
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the data");
		String input=xyz.nextLine();
		char ch[]=input.toCharArray();
		LowerToHigherApp l = new LowerToHigherApp();
		l.setCharArray(ch);
		l.LowerToHigherCase();
	}

}
