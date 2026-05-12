class SingleNumber 
{
	public static int singleNumber(int arr[])
	{
		int n =arr.length;
		for(int i=0 ; i<n ;i++)
		{
			int count = 0;
			for(int j=0 ; j<n ;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
			
			if(count == 1)
				return arr[i];
		}
		
		return -1;
	}
	
	public static void main(String[] args) 
	{
		int arr[] ={2,1,3,4,3,2,1};
		int single = singleNumber(arr);
		System.out.println(single);
	}
}
