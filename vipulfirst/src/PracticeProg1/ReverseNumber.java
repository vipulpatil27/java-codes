package PracticeProg1;
import java.util.*;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=xyz.nextInt();
		int rev=0,rem;
		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("Reverse number is: "+rev);
	}
}
