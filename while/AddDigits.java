class  AddDigits
{
	public static void main(String[] args) 
	{
		int n = 192837 ; 
		int sum = 0 ;
		
		while(n>0)
		{
			int lastdigit = n % 10 ; 

			sum = sum + lastdigit;
			
			n = n/ 10;
		}		
		System.out.println("sum is : "+sum);
	}
}
