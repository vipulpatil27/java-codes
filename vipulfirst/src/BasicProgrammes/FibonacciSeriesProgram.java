package BasicProgrammes;
import java.util.*;

public class FibonacciSeriesProgram {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=xyz.nextInt();
		int a=0,b=1,c=0;
		System.out.print(a+" , "+b);
		for(int i=0;i<no;i++)
		{
			c=a+b;
			System.out.print(" , "+c);
			a=b;
			b=c;
		}
	}
}
