package Interface;

interface ABC
{
	void show(); //internally it is public abstract void show(); 
}
class MNO implements ABC
{
	public void show()
	{
		System.out.println("I am ABC method");
	}
}
public class InterfaceApp1 {

	public static void main(String[] args) {
		MNO m=new MNO();
		m.show();

	}

}
