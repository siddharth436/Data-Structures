package collections;

import java.io.*;
import java.util.*;
public class arrayList1 {
	public static void main(String[] args) {
		ArrayList <Integer> al = new ArrayList<Integer>();
		for (int i = 0 ; i < 10 ; i++)
			al.add(i+50);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		
	}
	
	
	

}
