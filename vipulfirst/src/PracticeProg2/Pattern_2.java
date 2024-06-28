package PracticeProg2;
import java.util.*;

public class Pattern_2 {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=xyz.nextInt();
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
				if(j<=i)
				{
					if(i%2!=0)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print("@");
					}
				}
			}
			System.out.print("\n");
		}
	}
}
