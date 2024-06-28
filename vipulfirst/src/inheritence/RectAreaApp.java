package inheritence;
import java.util.*;

class Rectangle
{
	int length,breadth;
	Rectangle(int x,int y)
	{
		length=x;
		breadth=y;
	}
	Rectangle(int x)
	{
		length=x;
		breadth=10;
	}
	Rectangle()
	{
		length=10;
		breadth=1;
	}
	int getData()
	{
		return(length*breadth);
	}
}

public class RectAreaApp {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(2);
		Rectangle r3=new Rectangle(200,700);
		System.out.println("Area of first rectangle is :"+r1.getData());
		System.out.println("Area of second rectanle is :"+r2.getData());
		System.out.println("Area of third rectangle is :"+r3.getData());
	}

}
