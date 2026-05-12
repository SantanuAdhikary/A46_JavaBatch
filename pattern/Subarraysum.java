class Subarraysum
{
	public static void main(String[] args) 
	{
		//int arr[] = {1,2,3,4,5};
		
		int arr[] ={-2,1,-3,4,-1,2,1,-5,4};
		
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0 ; i<arr.length;i++)
		{
			for(int j=i; j<arr.length;j++)
			{
				int sum = 0;
				for(int k=i ; k<=j ; k++)
				{
					System.out.print(arr[k] +" ");
					sum = sum + arr[k];
				}
				maxSum = Math.max(sum,maxSum);
				System.out.println("sum is : "+sum);
				System.out.println();
			}
			
		}
		
		System.out.println("maximum sum is : "+maxSum);
	}
}
