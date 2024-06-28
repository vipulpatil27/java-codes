package collectionFrameworks;


import java.util.Vector;

public class colletionFrameworksApp1 {

	public static void main(String[] args) {
		Vector v = new Vector();
		int c=v.capacity();
		System.out.println("Initial size of vector is "+c);
	    v.add(100);
	    v.add(200);
	    v.add(300);
	    v.add(400);
	    v.add(500);
	    v.add(100);
	    v.add(200);
	    v.add(300);
	    v.add(400);
	    v.add(500);
	    v.add(600);
	    System.out.println("Size of vector is "+v.size());
	    System.out.println("Capacity after the size is "+v.capacity());
		

	}

}
