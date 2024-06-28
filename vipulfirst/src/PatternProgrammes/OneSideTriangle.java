package PatternProgrammes;
import java.util.*;

public class OneSideTriangle {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the size of row");
		int k=0;
		int size=xyz.nextInt();
		for(int i=1;i<=size;i++)
		{
			if(i<(size+1)/2)
			{
				k++;
			}
			else
			{
				k--;
			}
			for(int j=1;j<(size+1)/2;j++)
			{
				if(j<=k)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
