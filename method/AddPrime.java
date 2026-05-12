class AddPrime 
{
	public static boolean isPrime(int n)
	{
		int count = 0 ; 
		
		for(int i=1 ; i<=n ;i++)
		{
			if(n % i == 0 )
				count++;
		}
		if(count == 2 ) 
			return true;
		
		
		return false;
	}
	
	public static void main(String[] args) 
	{
		int n = 528467;
		int sum = 0 ;
		while(n > 0)
		{
			int ld = n % 10 ; 
			if(isPrime(ld))
			{
				sum =  sum + ld ; 
			}
			n = n / 10 ;
		}
		
		System.out.println("addition of prime digits is : "+sum);
	}
}
