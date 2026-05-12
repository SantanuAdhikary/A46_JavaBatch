class LinearSearch 
{
	public static int linearSearch(int arr[] , int item)
	{
		for(int i=0 ; i<arr.length;i++)
		{
			if(arr[i] == item)
				return i;
		}
		
		return -1;
	}
	
	public static void main(String[] args) 
	{
		int arr[] ={5,3,10,15,20,19,14};
		int item = 100;
		
	  int index =	linearSearch(arr,item);
	  
	  System.out.println(index);
	}
}
