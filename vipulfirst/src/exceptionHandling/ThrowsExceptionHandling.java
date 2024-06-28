package exceptionHandling;
import java.util.*;

class Div{
	void setValue(int x,int y) throws Exception
	{
		int z=x/y;
		System.out.println("Division id"+z);
	}
}
public class ThrowsExceptionHandling {

	public static void main(String[] args) {
		try {
			Div d=new Div();
			d.setValue(8, 0);
		}
		catch(Exception ex) 
		{
			System.out.println("Error is"+ex);
		}
	}

}
