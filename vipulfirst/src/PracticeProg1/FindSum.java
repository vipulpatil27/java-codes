package PracticeProg1;
import java.util.*;

class Sum{
	
	void setValue(int ...x)
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
	}
	int getSum()
	{
		return getSum();
	}
}
public class FindSum {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		Sum s=new Sum();
		s.setValue(10,20);
		s.getSum();
	}

}
