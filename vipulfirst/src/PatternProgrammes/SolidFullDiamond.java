package PatternProgrammes;
import java.util.*;

public class SolidFullDiamond {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the size of rows");
		int row=xyz.nextInt();
		int k=0,n=(row+1)/2;
		for(int i=1;i<=row;i++)
		{
			if(i<=n)
			{
				k++;
			}
			else
			{
				k--;
			}
			for(int j=1;j<=row;j++)
			{
				if(j>=n+1-k && j<=n-1+k)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
