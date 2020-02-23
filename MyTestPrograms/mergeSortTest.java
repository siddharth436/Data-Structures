package MyTestPrograms;

public class mergeSortTest {
	static void printArray(int arr[]) {
		for(int i = 0 ; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static void merge(int arr[],int l,int m,int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		int L[] = new int [n1];
		int R[] = new int [n2];
		for(int i = 0 ; i <n1;i++)
			L[i]= arr[l+i];
		for(int j = 0 ; j<n2;j++)
			R[j]=arr[m+1+j];
		
		int k = l;
		int i = 0 , j =0;
		
		while(i<n1 && j < n2) {
			if(L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}
			else
				if(R[j]<L[i]) {
					arr[k]=R[j];
					j++;
				}
			k++;
		
			
		}
		while(i<n1) {
			arr[k]=L[i];
			i++;
			k++;
				
		}
		while(j<n2) {
			arr[k]=R[j];
			j++;
			k++;
		}
		
}
	
	static void mergeSort(int arr[],int l,int r) {
		
		if(l<r) {
			int m = (l+r)/2;
			mergeSort(arr,l,m);
			mergeSort(arr,m+1,r);
			merge(arr,l,m,r);
	}
		
		

}
	
	public static void main(String[] args) {
		int arr [] = {10,4,3,28,97};
		System.out.println("Array before sorting");
		printArray(arr);
		System.out.println("Array After Sorting");
		mergeSort(arr,0,arr.length-1);
		printArray(arr);
	}
}
