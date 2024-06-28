package PracticeProg3;
import java.util.*;

public class StringOccurenceLinkedHashMap {
		public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=xyz.next();
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		for(char c:map.keySet())
		{
			System.out.println(c+"\t"+map.get(c));
		}
	}
}