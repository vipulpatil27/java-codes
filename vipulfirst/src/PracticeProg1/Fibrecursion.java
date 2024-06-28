package PracticeProg1;
import java.util.*;

public class Fibrecursion {
	static int n1=1,n2=2,n3=0;
	static void printfibo(int no) {
		if(no>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" "+n3);
		}
	}
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		int no=8;
		System.out.println(n1+""+n2);
		printfibo(no-2);
	}
}