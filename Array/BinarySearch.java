class BinarySearch 
{
	public static int binarySearch(int arr[] , int key)
	{
		  int i = 0 ; 
		  int j = arr.length-1;  
		  while(i<=j)
		  {
			 int mid = (i+j) / 2 ;
			 
			 if(arr[mid] == key)
				 return mid;
			 else if(key < arr[mid])
				 j = mid -1 ;
			 else
				 i = mid + 1;
		  }
		  
		  return -1;
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {18,21,27,29,35,41,48,56,63,65};
		int key = 49;
		int index =binarySearch(arr,key);
		System.out.println(index);
	}
}
