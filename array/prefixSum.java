package array;

public class prefixSum {
	public static void main(String[] args) {
		int arr[]= {2,8,3,9,6,5,4};
		int k=1;
		int m=3;
		int sum=0;
		for(int i=k;i<=m;i++)
			sum+=arr[i];
			
		System.out.println(sum);

}
}
