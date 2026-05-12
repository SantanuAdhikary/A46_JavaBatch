import java.util.Arrays;
class RainWater 
{
	public static void main(String[] args) 
	{
		//int a[] = {5,0,2,0,7}; 
		int a[] ={0,1,0,2,1,0,1,3,2,1,2,1};
		int n = a.length;
		int left[] = new int[n];
		int right[] = new int[n];
		int waterlevel = 0 ;
		
		left[0] = a[0];
		right[n-1] = a[n-1];
		
		// fill the left array
		for(int i=1 ; i<n ; i++)
		{
			left[i] = Math.max(a[i] , left[i-1]);
		}
		
		// fill the right array 
		
		for(int i=n-2 ; i>=0 ; i--)
		{
			right[i] = Math.max(a[i] , right[i+1]);	
		}
		
		for(int i=0 ; i<n ;i++)
		{
			waterlevel = waterlevel + (Math.min(left[i] , right[i])-a[i]);
		}
		
		System.out.println("array1 "+ Arrays.toString(a));
		System.out.println("left   "+ Arrays.toString(left));
		System.out.println("right  "+ Arrays.toString(right));
		
		System.out.println("water level is : "+waterlevel);
	}
}
