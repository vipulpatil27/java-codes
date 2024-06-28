package stringBufferStringBuilder;

import java.util.*;

public class MutableVsImmutable {

	public static void main(String[] args) {
		String s1 = "Good";
		String s2 =s1.concat("Bad");
		System.out.println(s2);
		StringBuffer sb = new StringBuffer("Good");
		sb.append(" Bad");
		System.out.println(sb);
	}

}
