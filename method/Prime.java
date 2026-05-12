class Prime 
{
	public static boolean isPrime(int n)
	{
		for(int i =2 ; i<=n/2 ;i++)
		{
			if(n % i ==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		int n = 97 ; 
		
		boolean ans = isPrime(n);
		
		if(ans)
			System.out.println("it is prime");
		else
			System.out.println("it is not prime");
	}
}
