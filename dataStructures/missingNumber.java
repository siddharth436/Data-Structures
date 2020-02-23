package dataStructures;

public class missingNumber {
	public static void main(String[] args) {
		int arr[]= {1,4,3};
		int x1=arr[0];
		int x2=1;
		
		
		for (int i = 1;i<arr.length;i++) {
			x1=x1^arr[i];
			
		}
		
		for(int j=2;j<=arr.length+1;j++)
			x2=x2^j;
	System.out.println(x1^x2);
			
		
		

}
}
