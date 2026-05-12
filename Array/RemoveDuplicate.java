import java.util.*;
class RemoveDuplicate
{
	public static void main(String args[])
	{
		int arr[] ={8,13,2,100,7,5,9,11,11,7,2,100};
		Arrays.sort(arr);
		
		HashSet<Integer> set = new HashSet<>();
		
		int j = 0 , n = arr.length;
		
		for(int i=0 ; i<n-1 ; i++)
		{
			if(arr[i] != arr[i+1])
			{
				arr[j] = arr[i];
				j++;
			}
		}
		
		arr[j]=arr[n-1];
		
		for(int i=0 ; i<=j ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		for(int i=0 ; i<n;i++)
		{
			set.add(arr[i]);
		}
		
		System.out.println(set);	
		
	}
}