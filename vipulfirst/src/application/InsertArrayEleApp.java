package application;
import java.util.*;

class InsertArrEle{
	int c[];
	void setArray(int c[]) {
		this.c=c;
	}
	void insertValueOnIndex() {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the index and value");
		int index=xyz.nextInt();
		int value=xyz.nextInt();
	//	System.out.println("Display after the putting the values");
		for(int i=4;i>=index;i--)
		{
			c[i+1] = c[i];
		}
		c[index]=value;
		System.out.println("Dispaly after the putting the values");
		for(int i=0;i<c.length;i++)
		{
			System.out.printf("c[%d]--->%d\n",i,c[i]);
		}
	}
}
public class InsertArrayEleApp {

	public static void main(String[] args) {
		int c[]=new int[6];
		Scanner xyz= new Scanner(System.in);
		System.out.println("Enter the values in array");
	    for(int i=0;i<5;i++)
	    {
	    	c[i]=xyz.nextInt();
	    }
	    InsertArrEle e=new InsertArrEle();
	    e.setArray(c);
        e.insertValueOnIndex();
	}

}
