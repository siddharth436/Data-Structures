package binarySearch;

public class leftMostIndexOfAnelement { 
	  static int leftIndex(int arr[], int n, int x)
	    {
	        int l = 0, h = n-1;
	        int mid = 0;
	        
	        while(l <= h)
	        {
	            mid = l + (h-l)/2;
	            
	            if(arr[mid] == x && (mid == 0 || arr[mid-1] != x))
	              return mid;
	            
	            else if(arr[mid] >= x)
	            	h = mid-1;
	            else 
	            	l = mid + 1;
	        }
	        return -1;
	    }
    // We reach here when element is not present 
	  
	  static int rightIndex(int arr[], int n, int x)
	    {
	        int l = 0, h = n-1;
	        int mid = 0;
	        
	        while(l <= h)
	        {
	            mid = l + (h-l)/2;
	            
	            if(arr[mid] == x && (mid == n-1 || arr[mid+1] != x))
	              return mid;
	            
	            else if(arr[mid] > x)
	              h = mid-1;
	            else 
	            	l = mid + 1;
	        }
	        return -1;
	    }
 
// Driver method to test above 
public static void main(String args[]) 
{ 
	 
	        int arr[] = new int[]{2, 3, 4, 5, 5, 5, 6, 6};
	        int n = arr.length;
	        int ele = 5;
	        
	        int leftOccur = leftIndex(arr, n, ele);
	        int rightOccur = rightIndex(arr, n, ele);
	        
	        System.out.println(rightOccur-leftOccur+1);
}
}


