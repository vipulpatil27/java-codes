package TestJava;
import java.util.*;

public class LinkedHasMap {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the values");
		String str = xyz.nextLine();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) 
		{
			char c = str.charAt(i);
			if (map.containsKey(c)) 
			{
				map.put(c, map.get(c) + 1);
			} else 
			{
				map.put(c, 1);
			}
		}
		for (char c : map.keySet())
		{
			System.out.println(c + "\t" + map.get(c));
		}
	}

}
