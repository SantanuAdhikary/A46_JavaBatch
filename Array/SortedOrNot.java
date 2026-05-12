class SortedOrNot 
{	
	public static boolean isSorted(int arr[])
	{
		int n = arr.length;	
		for(int i=0 ; i<n-1 ; i++)
		{
			if(arr[i] > arr[i+1])
				return false;
		}	
		return true;
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {5,8,9,1,10,50,60};
		boolean ans =isSorted(arr);
		System.out.println(ans);
		
		if(ans)
			System.out.println("it is sorted array");
		else
			System.out.println("it is not sorted array");
	}
}
