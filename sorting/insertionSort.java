package sorting;

public class insertionSort {
	
	public void iSort(int arr[]) {
		int n = arr.length;
		
		for(int i = 1 ; i<n;i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;	
			}
			arr[j+1]=key;
		}
	}
	
	static void printArr(int arr[]) {
		for(int i = 0 ; i<arr.length;i++) 
			System.out.print(arr[i] +" ");
			
		
		System.out.println();
		
		
		
	}
	
	public static void main(String[] args) {
		int arr[]= {12,11,13,5,6};
		
		insertionSort is = new insertionSort();
		is.iSort(arr);
		
		printArr(arr);
	}

}
