class  AddDigits
{
	public static int power(int b , int p)
	{
		int mul = 1 ; 
		for(int i=1 ; i<=p ; i++)
		{
			mul = mul * b ; 
		}
		return mul;
	}
	
	public static void main(String[] args) 
	{
		int n = 5234;
		int sum = 0 ; 

		while(n > 0)
		{
			int ld = n % 10 ; 
			sum = sum + power(ld ,3) ; 
			n  = n / 10 ;
		}
		System.out.println("sum is : "+sum);
	}
}
