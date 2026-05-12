import java.util.Arrays;
class RotateLeft 
{
	public static void main(String[] args) 
	{
		int arr[] = {10,15,40,90,30};
		
		System.out.println(Arrays.toString(arr));
		
		
		int start = arr[0] ;
		int n = arr.length;
		
		for(int i=1 ; i<n; i++)
		{
			arr[i-1] = arr[i] ;
		}
		
		arr[n-1] = start;
		
		System.out.println("after left rotate ");
		System.out.println(Arrays.toString(arr));
	}
}
