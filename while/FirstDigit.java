class FirstDigit 
{
	public static void main(String[] args) 
	{
		int num = 6879654;
		
		while(num > 9)
		{
			int lastdigit = num % 10 ;
			
			num = num / 10;
		}
		
		System.out.println("first digit is : "+num);
	}
}
