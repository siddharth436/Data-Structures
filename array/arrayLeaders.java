package array;

public class arrayLeaders {
	public static void main(String[] args) {
		int arr[]= {7,10,4,3,6,5,2};
		int lead[] = {};
		int flag =0;
		for(int i = 0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<=arr[j]) {
					flag=1;
					break;
					}
				else {
					flag=0;
					break;
					}
			}
			if(flag==1)
				lead[i]=arr[i];
		
			flag=0;
		}
		for(int k=0;k<arr.length;k++)
			System.out.println(lead[k]);
			
	}

}
