package binarySearch;

public class majorityElement1 {
	static int majorityElement(int arr[],int n) {
		int res=0;
		int count=1;
		for(int i = 0;i<n;i++) {
			if(arr[res]==arr[i])
				count++;
			else
				count--;
			if(count==0) {
				res=i;
				count=1;
			}
			
		}
		count=0;
		for(int i=0;i<n;i++) {
			if(arr[res]==arr[i]) {
				count++;
			}
		}
			if(count<=n/2)
				res=-1;
			return res;
		}
public static void main(String[] args) {
	int arr[]= {6,8,4,8};
	int n = arr.length;
	int x = majorityElement(arr,n);
	System.out.println(x);
	
}
	
}


