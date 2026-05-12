class  CountPrimes
{
	public static boolean isPrime(int n)
	{
		for(int i=2 ; i<=n/2 ; i++)
		{
			if(n % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {2,3,5,7,13,17,19,20,30,50};
		int count = 0 ;
		for(int i=0 ; i<arr.length ; i++)
		{
			if(isPrime(arr[i]))
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
}
