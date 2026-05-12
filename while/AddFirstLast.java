class AddFirstLast 
{
	public static void main(String[] args) 
	{
		int num = 804512;
		
		int lastdigit = num %10;
		num = num / 10;
		int sum = 0 ;
		while( num > 9)
		{
			int ld = num % 10 ; 
			sum = sum + ld;
			num = num / 10 ; 
		}
		System.out.println(lastdigit);
		System.out.println(num);
		
		int sum2 = lastdigit + num ;
		
		System.out.println(sum);
		
		if(sum == sum2)
			System.out.println("xylem number");
		else
			System.out.println("pholem number");
		
		
	}
}
