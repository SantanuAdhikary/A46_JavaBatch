class TwoSum2 
{
	public static boolean isPresent(int arr[] , int key)
	{
		 int i = 0 ;
		 int j = arr.length-1;
		 
		 while(i < j)
		{
			int sum = arr[i] + arr[j] ;
			
			if(sum == key)
				return true;
			else if(sum > key)
				j--;
			else 
				i++;
		}
		
		return false;
	}
	
	public static void main(String[] args) 
	{
		
		int arr[] = {1,3,4,6,8};
		int key = 13;
		boolean ans = isPresent(arr,key);
		System.out.println(ans);
		
		
	}
}
