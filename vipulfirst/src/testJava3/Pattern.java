package testJava3;

public class Pattern {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j<=6-i || j>=4+i)
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