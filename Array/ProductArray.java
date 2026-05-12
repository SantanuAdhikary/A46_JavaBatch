import java.util.Arrays;
class ProductArray 
{
	public static void main(String[] args) 
	{
		int arr[] ={1,2,3,4};
		int n = arr.length;
		int pre[] =new int[n];
		int suf[] =new int[n];
		int ans[] =new int[n];
		
		pre[0] = 1 ; 
		suf[n-1] = 1;
		
		for(int i=1 ; i<n ; i++)
		{
			pre[i] = arr[i-1] * pre[i-1];
		}
		
		for(int i=n-2 ; i>=0 ; i--)
		{
			suf[i] = arr[i+1] * suf[i+1];
		}
		
		for(int i=0 ; i<n ;i++)
		{
			ans[i] = pre[i] * suf[i];
		}
		
		System.out.println("prefix array "+ Arrays.toString(pre));
		System.out.println("suffix array "+Arrays.toString(suf));
		System.out.println("product array"+Arrays.toString(ans));
		
		
	}
}
