import java.util.Arrays;
class PosNeg 
{
	public static void main(String[] args) 
	{
		int arr[] ={1,-2,3,-6,-7,8,12,-9};
		
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			// both are positive
			
			if(arr[i]>=0 && arr[j] >=0)
			   i++;
			// both are negative
			else if(arr[i]<0 && arr[j] <0)
				j--;
			// first pos , last neg (both in correct place)
			else if(arr[i]>=0 && arr[j]<0)
			{
				i++;
				j--;
			}
			// first neg , last pos (both in wrong place)
			else
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		System.out.println("after arranging : "+Arrays.toString(arr));
	}
}
