package collectionFrameworks;

import java.util.*;
import java.util.Map;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(100, "A");
		map.put(200, "B");
		map.put(300, "C");
		for (Map.Entry m : map.entrySet()) 
		{
			System.out.println(m.getKey() + "\t" + m.getValue());
		}
	}
}
