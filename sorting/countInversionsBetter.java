package sorting;

public class countInversionsBetter {
	
	static int countInversion(int arr[],int l,int m,int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for(int i = 0 ; i < n1 ; i++) {
			L[i]= arr[l+i];
		}
		for(int j = 0 ; j<n2 ; j++) {
			R[j]=arr[m+j+1];
		}
		int k = l;
		int res=0;
		int i = 0 , j = 0;
		while(i<n1 && j<n2) {
			if(L[i]<R[j]) {
				arr[k]=L[i];
				i++;
			}
			else if(R[j]<L[i]) {
				arr[k]=R[j];
				res+=(m+1)-(l+i);
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			i++;
			k++;
		}
		while(j<n1) {
			j++;
			k++;
		}
		
		return res;
				
		
	}
	private static int count(int arr[],int l,int r) {
		
		int count=0;
		if(l<r) {
			int m = (l+r)/2;
			count +=count(arr,l,m);
			count +=count(arr,m+1,r);
			count +=countInversion(arr,l,m,r);
			
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		int arr[]= { 1, 20, 6, 4, 5 };
		int x =count(arr,0,arr.length-1);
		System.out.println(x);
		
		
	
	

}
}
