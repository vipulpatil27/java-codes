package jdkNewVersion;

import java.util.*;
import java.util.function.Predicate;

public class predicateProg1 {
	public static void main(String[] args) {	
		//we have anonymous inner class
		// anonymous inner class is a local inner class where we create the object of class as well as define its method called as anonymous inner class.
		Predicate<Integer> p = new Predicate<Integer>() {
			public boolean test(Integer t) {

				return t > 10;
			}
		};
		boolean b = p.test(20);
		System.out.println(b);
	}
}
