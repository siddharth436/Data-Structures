package geeksforgeeks;

public class swap {
	
	    public static void main(String[] args) {
			int arr[]= {2,3,9,20,21};
			int arrswap[]= {};
			 int j = 0;

			for (int i = 0 ; i <arr.length ; i++) {
				 while(j<=Math.ceil(arr.length/2)) {
					 	int x = 0;
					 	x = arr[j];
            			arr[j]=arr[j+2];
            			arr[j+2]=x;
//            			System.out.println(arr[j]);
            			j++;
            		
				}
				 System.out.print(arr[i]+" ");
				
			}
//			for (int i = 0 ; i < arr.length; i++) {
//					System.out.println(arrswap[i]);
//           
//     
//    }
	    
}
}