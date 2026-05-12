class Prime 
{
	public static boolean isPrime(int n)
	{
		int c = 0 ;
		
		int loopCount = 1;
		
		for(int i=1  ;i<=n ;i++)
		{
			if(n % i == 0)
				c++;
			
			System.out.println("loop count : "+loopCount++);
		}
		if(c == 2)
			return true;
		
	  return false;
	}
	
	public static void main(String[] args) 
	{
		int n = 100 ;
		
		boolean ans = isPrime(n);
		
		if(ans )
			System.out.println("it is prime number");
		else 
			System.out.println("it is not prime number");
	}
}
