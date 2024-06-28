package PracticeProg1;
import java.util.*;

public class FibbonacciUsingRecursion {
	static int fib(int n) {
		//base class
		if(n<=1)
		return n;
		//recursive call
		return fib(n-1)+fib(n-2);
	}
	//Driver class
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=xyz.nextInt();
		int N=size;
		for(int i=0;i<N;i++)
		{
			System.out.print(fib(i)+" ");
		}
	}
}