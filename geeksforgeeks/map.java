package geeksforgeeks;

import java.util.*;
public class map {
	public static void main(String[] args) {
		Map<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("a", 100);
		hm.put("b",200);
		hm.put("c", 300);
		hm.put("d", 400);
		Set <Map.Entry<String, Integer>> st = hm.entrySet();
		for (Map.Entry<String, Integer> me : st)
		{
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
	}

}
