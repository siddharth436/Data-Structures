package geeksforgeeks;

class Josephus{
	public int josephus(int n,int k)
	{
		if(n==1)
			return 0;
		else
			return josephus(n-1,k)+k%n;
					}
}