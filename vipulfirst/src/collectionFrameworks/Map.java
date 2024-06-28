package collectionFrameworks;
import java.util.*;

public class Map {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(10, "Vipul");
		map.put(2, "Nilesh");
		map.put(111, "vipul");
		map.put(null, null);
		map.put(null, "a");
		map.put(101, "ravi");
		System.out.println(map);
		//map.clear();
		//System.out.println(map.containsKey(110));
		//System.out.println(map.containsValue("vv"));
		//System.out.println(map.get(102));
		//map.remove(10);
		//System.out.println(map);
	}
}
