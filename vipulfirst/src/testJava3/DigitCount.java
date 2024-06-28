package testJava3;
import java.util.*;


class ExctractDigit{
	String s;
	void setString(String s) {
		this.s=s;
	}
	int getSum() {
		int sum=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				sum = sum + ((int)ch[i])-48;
			}
		}
		return sum;
	}
}
public class DigitCount {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the values in string");
		String s=xyz.nextLine();
		ExctractDigit x=new ExctractDigit();
		x.setString(s);
		System.out.println("The sum is: "+x.getSum());
	}
}
