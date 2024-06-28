package PatternProgrammes;
import java.util.*;

public class OppDiamondPattern {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int r=xyz.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=2*r-1;j++)
			{
				if(j>=i && j<=2*r-i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("\n");
		}
	}
}
