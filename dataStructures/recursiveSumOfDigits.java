package dataStructures;

public class recursiveSumOfDigits {
	public static int sum(int n) {
		int m=0;
		if(n==0)
			return 0;
		else if(n>0 && n<10)
			return n%10;
		else 
			m=m+n%10;
			n=n/10;
			return (m+sum(n));
		
	}
	
	public static void main(String[] args) {
		System.out.println(sum(9987));
	}

}
