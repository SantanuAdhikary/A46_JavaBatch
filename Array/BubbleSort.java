import java.util.Arrays;
class BubbleSort 
{
	public static void bubblesort(int[] arr)
	{
		int n = arr.length;
		int count = 0;
		for(int i=0 ; i<n-16 ; i++)
		{
			
			for(int j=0 ; j<n-1-i ; j++)
			{
				count++;
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j] ; 
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
		
	}
	
	public static void main(String[] args) 
	{
		int arr[] ={5,4,3,2,1};
		bubblesort(arr);
		
	}
}
