package geeksforgeeks;


import java.util.*; 
import java.math.*; 
class arrayObjectSort {
	 public static void main (String[] args) 
	    {
		 Pair p[] = new Pair[]{new Pair(2, 3), new Pair(4, 5), new Pair(6, 7)};
		 int temp = p[2].y;
		 p[2].y = p[0].y;
		 p[0].y = temp;
		 		
		 System.out.println(p[0].x + " " + p[0].y);
		 System.out.println(p[2].x + " " + p[2].y); 

	    }
	} 
