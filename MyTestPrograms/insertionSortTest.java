package MyTestPrograms;

public class insertionSortTest {
	
	static void iSort(int arr[]) {
		int n = arr.length;
		for (int i = 1 ; i<n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=key;
		}
	}
	
	
	static void printArray(int arr[]) {
		for (int i = 0 ; i < arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		}
	
	public static void main(String[] args) {
		int arr[]= {10,4,3,28,97};
		System.out.println("Unsorted Array");
		printArray(arr);
		System.out.println("Array after sorting");
		iSort(arr);
		printArray(arr);
				
	
	}
	
	

}
