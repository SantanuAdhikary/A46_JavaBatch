class Piramid1 
{
	public static void main(String[] args) throws Exception
	{
		int n = 13;
		
		for(int i=0 ; i<n;i++)
		{
			for(int j=0 ; j<n;j++)
			{
				if(i>=j && i+j<=n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
				
				Thread.sleep(50);
			}
			System.out.println();
		}
	}
}
