import java.util.Arrays;
class TwoSum 
{
	public static int[] find(int[] arr,int target)	
	{
		int ans[] = {-1,-1};
		for(int i=0 ; i<arr.length;i++)
		{
			for(int j=i+1 ; j<arr.length;j++)
			{
				if(arr[i] + arr[j] == target)
				{
					ans[0] = i;
					ans[1] = j;
				}
			}
		}
		return ans;
			
	}
	public static void main(String[] args) 
	{
		int arr[] ={2,11,7,15};
		int target = 9 ;
		System.out.println(Arrays.toString(find(arr,target)));
	}
}
