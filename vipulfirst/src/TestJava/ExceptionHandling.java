package TestJava;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the two vaues");
		a=xyz.nextInt();
		b=xyz.nextInt();
		try {
			c=a/b;
			System.out.printf("The output is: %d",c);
			try {
				System.out.printf("\nThe sum of two no is: %d",c);
			    }
			catch(Exception ex)
			{
				System.out.println("Error is "+ex);
			}
		}
		finally {
		System.out.println("Logic 1");
		System.out.println("Logic 2");
		}
	}

}
