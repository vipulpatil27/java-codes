//An Armstrong number is one whose sum of digits raised to the power three equals the number itself.
package PracticeProg1;
import java.util.*;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=xyz.nextInt();
		int temp=no,sum=0,rem,count=0;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		temp=no;
		while(temp>0)
		{
			rem=temp%10;
			int k=1,p=1;
			while(k<=count)
			{
				p=p*rem;
				k++;
			}
			sum=sum+p;
			temp=temp/10;
		}
		if(sum==no)
		{
			System.out.println("Number is armstrong number");
		}
		else
		{
			System.out.println("Number is not armstrong number");
		}
	}
}
