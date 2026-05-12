class AddEven
{
	public static void main(String[] args) 
	{
		int n = 123456 ;
		int sum = 0 ;
		int c = 0 ;
		
		while( n > 0 )
		{
			int lastdigit = n % 10 ; 
			
			if(n % 2 == 0 )
			{
				c++;
				sum = sum + lastdigit;	
			}			
			n = n / 10 ; 
		}
		System.out.println("sum is : "+sum);
		System.out.println("even number count is  : "+c);
	}
}
