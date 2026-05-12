class MaxMin 
{
	public static void main(String[] args) 
	{	
		int arr[] = {6,10,5,15,12,8};	
		int max = Integer.MIN_VALUE;	
		int min = Integer.MAX_VALUE;	
		fo r(int i=0; i< arr.length;i++)
		{
			if(arr[i] > max )
				max = arr[i];
			
			if(arr[i] < min)
				min = arr[i];
		}
		System.out.println("maximum element is : "+max);
		System.out.println("minimum element is : "+min);
	}
}
