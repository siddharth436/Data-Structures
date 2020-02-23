package dataStructures;

public class powerSet {
	public static void main(String[] args) {
		String k="abc";
		char c[]=k.toCharArray();
		int m=k.length();
		int powsize=(int) Math.pow(2,m);
		for(int counter = 0 ; counter< powsize; counter++ ) {
			for(int j=0;j<m;j++) {
				if((counter & (1<<j))!=0) {
					System.out.print(c[j]);
			}
				
		}
			System.out.println();
		
			
		}
	}
}


