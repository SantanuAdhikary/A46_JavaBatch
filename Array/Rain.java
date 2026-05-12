import java.util.Arrays;
class Rain 
{
	public static void main(String[] args) 
	{
		int a[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(Arrays.toString(a));
		int n = a.length;
		int left[] = new int[n];
		int right[] = new int[n];
		
		left[0] = a[0];
		right[n-1] = a[n-1];
			
		for(int i=1 ; i<n ;i++)
		{
			left[i] = Math.max(a[i] , left[i-1]);
		}
		
		System.out.println(Arrays.toString(left));
		
		for(int i= n-2 ; i>=0 ; i--)
		{
			right[i] = Math.max(a[i] , right[i+1]);
		}
			
			System.out.println(Arrays.toString(right));
			
	    int water = 0 ;
		
		for(int i=0 ; i<n ;i++)
		{
			water = water + (Math.min(left[i] , right[i])-a[i]);
		}
		
		System.out.println(water);
	}
}
