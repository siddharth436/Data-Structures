package geeksforgeeks;

import java.util.*;
public class arraylist2 {
	public static void main(String[] args) {
		LinkedList<String> object = new LinkedList<String>();
		object.add("jojo");
		object.add("Hakimi");
		System.out.println(object);
		object.add(0, "Ramesh");
		System.out.println(object);
		object.addFirst("Siddharth");
		object.addLast("Harshit");
		System.out.println(object);
		object.remove();
		object.removeFirst();
		object.removeLast();
		
		System.out.println(object);
		LinkedList<String> object2 = new LinkedList<String>();
		object2.add("hagga");
		object2.add("Susu");
		object2.add("pishab");
		object2.addAll(1,object);
		System.out.println(object2);
		

	}

}
