class ArmstrongNumber2 
{
	public static int power(int b , int p)
	{
		int mul = 1 ; 
		
		for(int i=1 ; i<=p ; i++)
		{
			mul = mul * b;
		}
		return mul;
	}
	
	public static int countDigits(int n)
	{
		int c = 0 ;
		while(n > 0)
		{
			c++;
			n = n / 10;
		}
		
		return c;
	}
	
	public static void main(String[] args) 
	{
		int n = 145; 
		
		int count = countDigits(n);
		
		System.out.println("count is : "+count);
		
		int temp = n ;
		int sum = 0 ;
		while(n > 0)
		{
			int ld = n % 10 ; 
			sum = sum + power(ld,count);
			n = n / 10;
		}
		
		System.out.println("sum is : "+sum);
		
		if(sum == temp)
			System.out.println("it is armsrong number");
		else
			System.out.println("it is not armstrong number");
	}
}
