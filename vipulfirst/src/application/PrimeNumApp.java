package application;
import java.util.*;
public class PrimeNumApp {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		int i,j,no;
		boolean flag=true;
		System.out.println("Enter the number to find the prime number");
		no=xyz.nextInt();
		System.out.println("Prime numbers are");
		for(i=3;i<=no;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.printf("\n%d",i);
			}
			else
			{
				flag=true;
			}
		}
	}

}
