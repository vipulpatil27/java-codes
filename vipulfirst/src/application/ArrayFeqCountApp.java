package application;

import java.util.*;
class ArrayFeqCount{
	int c[];
	void setIntArray(int c[] ) {
		this.c=c;
	}
	void countFeqCount() {
		int i,j,temp;
		Scanner xyz=new Scanner(System.in);
		System.out.println("Sorting the array");
		for(i=0;i<c.length;i++) {
			for(j=i+1;j<c.length;j++) {
				if(c[i]>c[j]) {
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		System.out.println("Display the sorted array");
		int count=0;
		for(i=0;i<c.length;i++) {
			if(c[i]==c[i+1]) 
			{
				count++;
			}
			else
			{
				System.out.printf("\n%d ---> %d",c[i],count);
				count=1;
			}
		}
	}
}
public class ArrayFeqCountApp {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		int c[]=new int[6];
		System.out.println("Enter the vlaues in array");
		for(int i=0;i<5;i++) 
		{
			c[i]=xyz.nextInt();
		}
        ArrayFeqCount v =new ArrayFeqCount();
        v.setIntArray(c);
        v.countFeqCount();
	}

}
