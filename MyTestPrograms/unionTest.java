package MyTestPrograms;

public class unionTest {
	
	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5,5,6,7,8,9};
		int arr2[]= {4,5,7,8,9,0,0};
		int m = arr1.length;
		int n = arr2.length;
		unionArray(arr1,arr2,m,n);
		
	}
	
	static void unionArray(int arr1[],int arr2[],int m, int n) {
		int i=0 , j = 0;
		while(i<m && j<n) {
			if(arr1[i]<=arr2[j]) {
				i++;
			}
			else if(arr2[j]<=arr1[i]) {
				j++;
			}
			else {
				System.out.print(arr2[j++]+" ");
				i++;
			}
			while(i<m) {
				System.out.print(arr1[i++]+" ");
			}
			while(j<n) {
				System.out.print(arr2[j++]+" ");
			}
		
	}
	}
}


