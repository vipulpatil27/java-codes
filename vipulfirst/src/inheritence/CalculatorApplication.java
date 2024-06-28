package inheritence;
import java.util.*;

class Value{
	int a,b;
	void setValue(int x,int y)
	{
		a=x;
		b=y;
	}
}
class Add extends Value{
	void showAdd()
	{
		System.out.print("Addition is "+a+b);
	}
}
class Mul extends Value{
	void showMUl()
	{
		System.out.print("Multiplcation is "+a*b);
	}
}
class Div extends Value{
	void showDiv()
	{
		System.out.print("Division is "+a/b);
	}
}
public class CalculatorApplication {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("1:Addition");
		System.out.println("2:Multiplication");
		System.out.println("3:Division");
		System.out.println("Enter the two values");
		int a=xyz.nextInt();
		int b=xyz.nextInt();
		System.out.println("Enter your choice");
		int choice=xyz.nextInt();
		switch(choice)
		{
		case 1:
			Add add=new Add();
			add.setValue(a, b);
			add.showAdd();
			break;
		case 2:
			Mul m=new Mul();
			m.setValue(a, b);
			m.showMUl();
			break;
		case 3:
			Div d=new Div();
			d.setValue(a, b);
			d.showDiv();
			break;
			default:
			System.out.println("you have entered wrong choice");
		}
	}
}
