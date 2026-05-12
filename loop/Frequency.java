class Frequency 
{
	public static void main(String[] args) 
	{
		
		for(int i=0 ; i<=9 ; i++)
		{	
			int n = 502125;
			int count = 0 ;
			
			while(n > 0)
			{
				int ld = n % 10 ;
				
				if(ld == i)
					count++;
				
				n = n/10;
			}
			if(count >0)
			  System.out.println(i +" -> "+count);
		}
	}
}
