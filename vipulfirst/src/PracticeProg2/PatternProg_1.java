package PracticeProg2;
import java.util.*;

public class PatternProg_1 {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=xyz.nextInt();
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
				if(i==j)
				{
					System.out.printf("*");
				}
				else
				{
					System.out.printf(" ");
				}
			}
			System.out.println("");
		}
	}
}
