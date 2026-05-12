class AddEven 
{
	public static boolean isEven(int n)
	{
		if(n % 2 == 0)
			return true;
		
		return false;
	}
	
	public static void main(String[] args) 
	{
		int n = 562358;
		
		int sum = 0 ;
		while(n > 0)
		{
			int ld = n % 10 ; 
			
			if(isEven(ld))
			{
				sum = sum + ld ; 
			}
			n = n / 10;
		}
		
		System.out.println("sum is : "+sum);
	}
}
