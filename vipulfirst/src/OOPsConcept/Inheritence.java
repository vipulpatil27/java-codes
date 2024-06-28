package OOPsConcept;
import java.util.*;

class Value{
	int a,b;
	
	void setValue(int x,int y) {
		this.a=x;
		this.b=y;
	}
}
class Add extends Value{
	void showAdd() {
		System.out.printf("Addition is %d\n",a+b);
	}
}
class Mul extends Value{
	void showMul() {
		System.out.printf("Multiplication is %d\n",a*b);
	}
}
class Sub extends Value{
	void showSub() {
		System.out.printf("Subtraction is %d\n",a-b);
	}
}
class Div extends Value{
	void showDiv() {
		System.out.printf("Division is %d\n",a/b);
	}
}
public class Inheritence {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		int choice = 0;
		System.out.println("1:Addition");
		System.out.println("2:Multiplication");
		System.out.println("3:Subtraction");
		System.out.println("4:Division");
		System.out.println("Enter two values");
		int a=xyz.nextInt();
		int b=xyz.nextInt();
		System.out.println("Enter your choice");
		switch(choice) {
		case 1:
			Add ad=new Add();
			ad.setValue(a, b);
			ad.showAdd();
			break;
		
		case 2:
			Mul m=new Mul();
			m.setValue(a, b);
			m.showMul();
			break;
		case 3: 
			Sub s=new Sub();
			s.setValue(a, b);
			s.showSub();
			break;
		case 4:
			Div d=new Div();
			d.setValue(a, b);
			d.showDiv();
			break;
			default:
				System.out.println("Wrong choice");
		}	
  }
}