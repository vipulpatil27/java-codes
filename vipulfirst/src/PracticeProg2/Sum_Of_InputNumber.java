package PracticeProg2;
import java.util.*;
public class Sum_Of_InputNumber {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=xyz.nextInt();
		int rem,sum=0;
		while(no>0)
		{
			rem=no%10;
			no=no/10;
			sum=sum+rem;
		}
		System.out.println("The sum of digit is: "+sum);
	}
}
