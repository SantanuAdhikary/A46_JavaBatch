class Box4 
{
	public static void main(String[] args) 
	{
		int n = 5 ;
		
		for(int i=0 ; i<n ;i++)
		{
			// box1 
			
			for(int j=0 ; j<n;j++)
			{
				if(j==0 || i==n/2 )
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			
			System.out.print("   ");
			
			// box2
			
			 for(int j=0 ; j<n;j++)
			{
				if(i==0 || j==n-1 || i+j==n-1 )
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			
			System.out.print("   ");
			
			// box3
			for(int j=0 ; j<n;j++)
			{
				if(j==0 || i==n-1 || i+j==n-1 )
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			
			System.out.print("   ");
			// box4
			
			for(int j=0 ; j<n;j++)
			{
				if(j==n-1 || i==n/2 )
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			
			
			System.out.println();
		}
	}
}
