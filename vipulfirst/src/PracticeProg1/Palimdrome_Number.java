package PracticeProg1;
import java.util.*;

public class Palimdrome_Number {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=xyz.nextInt();
		int rem,rev=0,temp=no;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println("Number is palimdrome.");
		}
		else
		{
			System.out.println("Number is not palimdrome");
		}
	}
}