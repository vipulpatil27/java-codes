package exceptionHandling;

import java.util.Scanner;

public class AnyExceptionApp {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the two values");
		a=xyz.nextInt();
		b=xyz.nextInt();
		try {
			c=a/b;
			 System.out.printf("The output is :%d",c);
		}
       catch(ArithmeticException ex)
		{
    	   System.out.println("Error is"+ex);
		}
		System.out.println("Logic 1");
		System.out.println("Logic 2");
	}

}
