import java.util.Arrays;
class  MoveZero
{
	public static void main(String[] args) 
	{
		int a[] = {0,1,0,3,12};
		
		int b[] = new int[a.length];
		
		int k = 0 ; 
		int i= 0 ;
		
		while(i<a.length)
		{
			if(a[i] > 0)
			{
				b[k] = a[i];
				k++;
				i++;
			}
			else
			{
				i++;
			}	
		}
		
		for(int j=0 ; j<b.length;j++)
		{
			a[j] = b[j];
		}
		
		System.out.println(Arrays.toString(a));
	}
}
