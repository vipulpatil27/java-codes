//An Armstrong number is one whose sum of digits raised to the power three equals the number itself (371,153,370)
package PracticeProg2;
import java.util.*;

public class Armstrong_Number {
	public static void main(String[] args) {	
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=xyz.nextInt();
		int result=0,rem;
		int temp=no;
		while(no>0)
		{
			rem=no%10;
			no=no/10;
			result=result+(rem*rem*rem);
		}
		if(result==temp)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not armstrong number");
		}
	}
}
