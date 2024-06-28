package PatternProgrammes;
import java.util.*;

public class Xpattern {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		int a=xyz.nextInt();
		if(a%2==0)
		{
			a=a-1;
			for(int i=0;i<a;i++)
			{
				if(i<=(a/2+1))
				{
					for(int j=1;j<=a;j++)
					{
						if(i==j || j==(a+1)-i)
						{
							System.out.println(i);
						}
						else
						{
							System.out.println(" ");
						}
					}
				}
				else
				{
					int k=(a+1)-i;
					for(int j=1;j<a;j++)
					{
						if(i==j || j==(a+1)-i)
						{
							System.out.println(k);
						}
						else
						{
							System.out.println(" ");
						}
						System.out.println();
					}
				}
			}
		}
	}
}
