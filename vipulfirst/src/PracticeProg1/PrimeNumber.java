package PracticeProg1;
import java.util.*;

public class PrimeNumber {
	public static void main(String[] args) {

		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = xyz.nextInt();
		int count = 0;
		for (int i=2; i<=no/2; i++) 
		{
			if (no%i == 0) {
				count++;
				break;
			}
		}
		if (count==0 && no!=1) 
		{
			System.out.println("Number is prime");
		} 
		else
		{
			System.out.println("Number is not prime");
		}
	}
}