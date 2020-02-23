package sorting;

import java.util.Arrays;
import java.util.Collections;

public class array_sort {
	
	public static void main(String[] args) {
		Integer arr[] = {10,20,3,37,89,201};
//		Arrays.sort(arr);
//		System.out.println("Increasing Order:" +Arrays.toString(arr));
//		Arrays.sort(arr,Collections.reverseOrder());
//		System.out.println("Decreasing Order:" +Arrays.toString(arr));
		Arrays.sort(arr,1,5);
		System.out.println(Arrays.toString(arr));
		
		}

}
