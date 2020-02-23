package geeksforgeeks;

import java.util.Arrays;

public class anagram {
	public static void main(String[] args) {
		String m = "madam";
		String k =	"madame";
		String blank="";
		String blank2="";
		char z[]=m.toLowerCase().toCharArray();
		char f[]=k.toLowerCase().toCharArray();
		Arrays.sort(f);
		Arrays.sort(z);
		for(char c:z)
			blank=blank+c;
		System.out.println(blank);
		for(char a:f)
			blank2+=a;
		System.out.println(blank2);
		if(blank.equalsIgnoreCase(blank2)) {
			System.out.println("Anagrams");
		}
		else
			System.out.println("Not anagrams");
	
		
		
	
		
		}
	
	
	}


