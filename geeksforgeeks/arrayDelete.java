package geeksforgeeks;

public class arrayDelete {
	public static void main(String[] args) {
		int arr[]= {1,6,8,11,14,19};
		int x=8;
		int j =arr.length;
		for(int i = 0;i<j;i++) {
			if(x==arr[i]) {
				j=j-1;
				arr[i]=arr[i+1];
				
				
				
		}
			else {
				for(int i=0;i<j;i++)
					System.out.println(arr[i]);
					
		}
		}
		
		}
		

}
