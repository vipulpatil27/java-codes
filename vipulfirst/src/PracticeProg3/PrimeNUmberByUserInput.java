package PracticeProg3;
import java.util.*;

public class PrimeNUmberByUserInput {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=xyz.nextInt();
		System.out.println("Prime no between 1 to "+no+" are");
		for(int i=1;i<=no;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}
}