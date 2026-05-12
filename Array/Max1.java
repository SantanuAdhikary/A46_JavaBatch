class  Max1
{
	public static void main(String[] args) 
	{
		int arr[]={0,1,1,0,1,1,1,0,1};
		int count = 0 ;
		int maxCount = Integer.MIN_VALUE;
		for(int i=0 ; i<arr.length; i++)
		{
			if(arr[i] == 1)
			{
				count++;
				maxCount  = Math.max(count,maxCount);
			}
			else
			{
				count = 0 ;
			}
		}
		
		System.out.println("maximum consecutive one is : "+maxCount);	
	}
}
