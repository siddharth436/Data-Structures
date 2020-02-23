package binarySearch;

import java.util.HashSet;

public class twoPointer {
	static void printPairs(int arr[],int sum)
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i = 0; i< arr.length;i++) {
			int  temp = sum-arr[i];
		
		
		if (hs.contains(temp)) { 
			System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")"); 
		}
		
			
		
		hs.add(arr[i]); 
		}
	}
	public static void main(String[] args) {
		int arr[]={ 1, 4, 45, 6, 10, 8 };
		int n = 5;
		printPairs(arr,n);
		
	}
	

}
