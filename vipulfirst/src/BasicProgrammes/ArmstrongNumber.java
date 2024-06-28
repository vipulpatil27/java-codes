package BasicProgrammes;
import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=xyz.nextInt();
		int temp=no,count=0,rem,sum=0;
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
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
	}
}
