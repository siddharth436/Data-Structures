package geeksforgeeks;
import java.util.*;


public class secondMap {
	public static void main(String[] args) {
		Set<Integer> a = new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] {1,3,2,4,8,9,0}));
		Set<Integer> b = new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] {1,3,7,5,4,0,7,5}));
		
		Set<Integer> union = new HashSet<Integer>(a);
		union.addAll(b);
		System.out.println(union);
		Set<Integer> intersection = new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.println(intersection);
		
		Set<Integer> difference = new HashSet<Integer>(a);
		difference.removeAll(b);
		System.out.println(difference);
	}

}
