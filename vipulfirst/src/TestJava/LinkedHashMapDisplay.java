package TestJava;
import java.util.*;

public class LinkedHashMapDisplay {
	public static void main(String[] args) {
		
		Scanner xyz=new Scanner(System.in);
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		System.out.println("Enter the values");
		map.put(1,100);
		map.put(1,100);
		map.put(1,100);
		map.put(1,100);
		System.out.println("The contents are ");
		for(Integer obj : map.keySet())
		{
			System.out.println(map+":"+map.get(map));
		}
	}

}
