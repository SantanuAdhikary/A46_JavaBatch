class Diamond 
{
	public static void main(String[] args) throws Exception 
	{
		int n = 13 ;
		
		for(int i=0 ; i<n; i++)
		{
			for(int j=0 ; j<n ;j++)
			{
				if(i+j<=n-1-n/2 || i+j>=n-1+n/2 ||  i<=j-n/2 || i>=j+n/2 )
					System.out.print("  ");
				else
					System.out.print("* ");
				
				//Thread.sleep(100);
			}
			System.out.println();
		}
	}
}
