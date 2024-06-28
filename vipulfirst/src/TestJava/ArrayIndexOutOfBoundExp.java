package TestJava;

import java.util.Scanner;

public class ArrayIndexOutOfBoundExp {

	public static void main(String[] args) {
		int i,j;
	    Scanner  xyz =new  Scanner(System.in);
	    System.out.println("Enter the two value");
	    int a[]=new int[2];
	    a[0]=100;
	    a[1]=200;
	    try {
	    	System.out.println("valiue is "+a[2]);
	    }
	    catch(ArrayIndexOutOfBoundsException ex)
	    	{
	    	    System.out.println("Avoid the extra input value rather than orignal size");
	    		System.out.println("Array limit exceeds"+ex);
	    	}
	    System.out.println("\nLogic 1");
		System.out.println("Logic 2");
		System.out.println("Logic 3");
	    }
	}


