import java.util.Arrays;
class RightRotate2 
{
	public static void main(String[] args) 
	{
		
		int a[]={10,20,30,40,50};
		int k = 3 ;
		int n = a.length;
		int b[] = new int[n];
		
		for(int i=0 ; i<n ;i++)
		{
			b[(i+k)%n] = a[i];
		}
		
		System.out.println(Arrays.toString(b));
	}
}
