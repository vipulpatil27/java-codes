package collectionFrameworks;

import java.util.*;

public class ArrayListMaxApp {

	public static void main(String[] args) {
		Scanner xyz= new Scanner(System.in);
		ArrayList al =new ArrayList();
		System.out.println("Enter the values in array");
	    for(int i=1;i<=5;i++)
	    {
	    	int no=xyz.nextInt();
	    	al.add(no);
	    }
	    System.out.println("The elements are in array is "+al);
	    Object obj=al.get(0);
	    int max=(int)obj;
	    for(int i=0;i<al.size();i++)
	    {
	    	Object obj1=al.get(i);
	    	if((int)obj1>max)
	    	{
	    		max =(int)obj1;
	    	}
	    }
	    System.out.println("Max is "+max);
	}

}
