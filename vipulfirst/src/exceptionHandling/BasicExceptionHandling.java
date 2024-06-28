package exceptionHandling;
import java.util.*;

public class BasicExceptionHandling {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the two values");
		a=xyz.nextInt();
		b=xyz.nextInt();
		try {
			c=a/b;
			System.out.printf("\nDivision is %d",c);
		}
		catch(Exception ex)
		{
			System.out.println("Avoid the second value of as zero");
			System.out.println("Otherwise you will get an error "+ex);
		}
		System.out.println("Logic 1");
		System.out.println("Logic 2");
		System.out.println("Logic 3");
	}
}
