import java.util.Arrays;
class SelectionSort 
{
	public static void main(String[] args) 
	{
		
		int arr[] = {50,20,10,30,40};
		System.out.println("before sorting : "+Arrays.toString(arr));
		int n = arr.length;
		for(int i=0 ; i<n ;i++)
		{
			int minIndex = i;
			for(int j = i+1 ; j<n ; j++)
			{
				if(arr[j] < arr[minIndex])
				{
					minIndex = j;
				}
			}
			// swap 
			int temp = arr[i] ; 
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		System.out.println("after sorting : "+Arrays.toString(arr));
	}
}
