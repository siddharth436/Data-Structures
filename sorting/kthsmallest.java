package sorting;

import java.util.*;

public class kthsmallest {
	public static void main(String[] args) {
		System.out.println("Enter the degree of the number to be printed");
		int k = 2;
		
		int arr []= {2,7,1,3,20,156,7,46};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Second highest element is");
		System.out.println(arr[k-1]);
		
		
	}
	
	
	
	

}
