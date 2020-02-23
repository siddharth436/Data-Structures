package dataStructures;

public class recursionPrintNumbers {
	public static int printNum(int n) {
		if(n==0)
			return 0;
		
			int m=n-1;
			System.out.println(n-m);
		
			return printNum(n-1);
			
		
	}
	public static void main(String[] args) {
		System.out.println(printNum(6));
	}

}
