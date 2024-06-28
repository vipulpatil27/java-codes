package Interface;

import java.util.*;

interface Value {
	void setValue(int x, int y);

	void performOperation();
}

class Add implements Value {
	int first, second;

	public void setValue(int x, int y) {
		first = x;
		second = y;
	}

	public void performOperation() {
		System.out.println("Addition is :" + (first + second));
	}
}

class Mul implements Value {
	int first, second;

	public void setValue(int x, int y) {
		first = x;
		second = y;
	}

	public void performOperation() {
		System.out.println("Multiplication is: " + (first * second));
	}
}
class Calculator {
	void performCal(Value v)
	{
		v.setValue(10, 20);
		v.performOperation();
	}
}
public class CalculatorApplication {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		Value v=null;
		Calculator c=new Calculator();
		System.out.println("1: Addition");
		System.out.println("2: Multiplication");
		System.out.println("Enter your choice");
		int choice=xyz.nextInt();
		switch(choice)
		{
		case 1:
			v=new Add();
			c.performCal(v);
			break;
		case 2:
			v=new Mul();
			c.performCal(v);
			break;
			default:
				System.out.println("Wrong Choice");
		}
		
	}

}
