package exceptionHandling;
import  java.util.*;

public class NestedExceptionhandlingApp {

	public static void main(String[] args) {
		int i,j;
	    Scanner  xyz =new  Scanner(System.in);
	    System.out.println("Enter the two value");
	    int a=xyz.nextInt();
	    int b=xyz.nextInt();
	    try {
	    	int c=a+b;
		    System.out.printf("\nThe sum of two nos is :%d",c);
		    try {
		    	System.out.printf("\nthe sum is :%d",c);
	            }
	    catch (ArithmeticException ex)
	    {
	    	
	    }
	}
	    finally {
	    	System.out.println("Logic 1");
	    	System.out.println("Logic 2");
	    	System.out.println("Logic 3");
	    }
	}
}
