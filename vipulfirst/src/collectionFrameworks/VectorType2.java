package collectionFrameworks;

import java.util.Vector;

public class VectorType2 {

	public static void main(String[] args) {
		Vector v=new Vector(3);
		int c=v.capacity();
		System.out.println("Initial size of vector is "+c);
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);
        System.out.println("size of vector is "+v.size());
        System.out.println("Capacity after size "+v.capacity());
        
	}

}
