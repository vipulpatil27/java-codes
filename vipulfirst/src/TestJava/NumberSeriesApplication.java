package TestJava;
import  java.util.*;

public class NumberSeriesApplication {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Theis series is 6 and 7: ");
		System.out.println("Enter the size"); //enter the size of series occurs
		int size=xyz.nextInt(),no1,no2;
		for(int i=0;i<size;i++)
		{
			no1=i*6;
			no2=i*7;
			System.out.println("\t"+no1+"\t"+no2);
			
		}
	}

}
