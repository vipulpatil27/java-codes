package String;
import java.util.*;

class CheckAllCharSameOrNot{
	private String str;
	public void acceptSrting(String str) {
		this.str=str;
	}
	boolean checkSame()
	{
		boolean b=true;
		char ch[]=str.toCharArray();
		char ch1=ch[0];
		return b;
	}
}
public class CheckSameString {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=xyz.nextLine();
		CheckAllCharSameOrNot c=new CheckAllCharSameOrNot();
		c.acceptSrting(str);
		c.checkSame();
	}

}
