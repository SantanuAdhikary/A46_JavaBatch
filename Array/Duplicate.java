import java.util.Arrays;
class Duplicate
{
	public static int findDuplicate(int[] arr)
	{
		for(int i=0 ; i<arr.length; i++)
		{
			for(int j=i+1 ; j<arr.length ;j++)
			{
				if(arr[i] == arr[j])
					return arr[i];
			}
		}
		return -1;
	}
	
	
	public static int find(int[] arr)
	{
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		for(int i=0 ; i<arr.length-1;i++)
		{
			if(arr[i] == arr[i+1])
				return arr[i];
		}
		
		return -1;
	}
	
	public static void main(String[] args) 
	{
		
		int arr[] ={2,10,5,3,1,5,12};
		int duplicate = findDuplicate(arr);
		System.out.println(duplicate);
		
		
		System.out.println("------ by using sorting --------------");
		
		int duplicate2 = find(arr);
		System.out.println(duplicate2);
	}
}
