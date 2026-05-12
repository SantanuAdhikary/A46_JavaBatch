import java.util.Arrays;
class Replace 
{
	public static void main(String[] args) 
	{
		int arr[] ={1,2,3,6,9,13,5};
		
		for(int i=0 ; i<arr.length;i++)
		{
		   if(arr[i] % 2 == 0)	
			  arr[i]= arr[i] * 10; 
		   else
			   arr[i] = arr[i] * 20;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
