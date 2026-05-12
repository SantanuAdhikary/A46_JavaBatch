import java.util.Arrays;
class RightRotate 
{
	public static void main(String[] args) 
	{
		int arr[] = {10,15,40,90,30};
		
		System.out.println(Arrays.toString(arr));
		
		int n = arr.length-1;
		int last = arr[n-1] ;
		
		for(int i=n-2 ; i>=0; i--)
		{
			arr[i+1] = arr[i] ;
		}
		
		arr[0] = last;
		
		System.out.println("after Right rotate ");
		System.out.println(Arrays.toString(arr));
	}
}
