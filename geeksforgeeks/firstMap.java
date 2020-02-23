package geeksforgeeks;
import java.util.*;

public class firstMap {
	public static void main(String[] args) {
		
		Set<String> hash_set = new HashSet<String>();
		hash_set.add("Geeks");
		hash_set.add("For");
		hash_set.add("Geeks");
		hash_set.add("Example");
		hash_set.add("Set");
		System.out.println("Set output without the duplicates");
		System.out.println(hash_set);
		System.out.println("in sorted order");
		Set<String> sort_hash_set= new TreeSet<String>(hash_set);
		System.out.println(sort_hash_set);
		
		
	}

}
