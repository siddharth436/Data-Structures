package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class collectionsSort {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(17);
		al.add(2);
		al.add(59);
		al.add(67);
		al.add(72);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
	}

}
