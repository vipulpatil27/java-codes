package BasicProgrammes;
import java.util.*;

public class PalimdromeNumber {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=xyz.nextInt();
		int temp=no,rev=0,rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println("Palimdrome number");
		}
		else
		{
			System.out.println("Not Palimdrome number");
		}
	}
}