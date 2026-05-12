import java.util.Arrays;
class Sort012 
{
	public static void main(String[] args) 
	{
		int arr[] ={1,0,2,1,0,2,0};
		int i= 0 ,j = arr.length-1, k = 0 ; // traversing 

		while(k<j)
		{
			if(arr[k] == 1)
				k++;
			
			else if(arr[k] == 0)
			{
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				k++;
				i++;
			}
			else
			{
				int temp = arr[k];
				arr[k] = arr[j];
				arr[j] =temp;
				j--;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
