package PatternProgrammes;

public class IncDecNumPattern {
	public static void main(String[] args) {
		int k;
		for(int i=1;i<=4;i++)
		{
			k=i;
			for(int j=1;j <=7;j++)
			{
				if(j>=5-i && j<=3+i)
				{
					System.out.printf("%d",k);
					if(j<4)
					{
						k++;
					}
					else
					{
						k--;
					}
				}
				else
				{
					System.out.printf(" ");
				}
			}
			System.out.println("\n");
		}
	}
}
