class Stock2 
{
	public static void main(String[] args) 
	{
		int a[] = {1,5,3,8,4,9};
	
		int profit = 0 ;
		int totalProfit = 0 ;
		
		for(int i=0 ; i<a.length-1;i++)
		{
			if(a[i+1] > a[i] )
			{
				profit = a[i+1] - a[i];
				totalProfit = totalProfit + profit;
			}
				
		}
		
		System.out.println("total profit is : "+totalProfit);
	}
}
