
import java.util.*;
class MergeArray 
{
	public static void main(String[] args) 
	{
		int a[] = {5,9,13,18,21,30,39};
		int b[] ={6,7,10,15};
		
		int n = a.length;
		int m = b.length;
		
		int c[] = new int[m+n];
		int k = 0 ;
		int i=0 ; 
		int j = 0 ;
		
	
		
		// both array having elements 
		
		while(i<n && j<m)
		{
			if(a[i] < b[j])
			{
				c[k] = a[i];
				k++;
				i++;
			}
			else
			{
				c[k] = b[j];
				k++;
				j++;
			}
		}
		
		
		// array a having elements 
		
		while(i<n)
		{
			c[k] = a[i];
			k++;
			i++;
		}
		
		// array b having elemnts 
		
		while(j < m)
		{
			c[k] = b[j];
			k++;
			j++;
		}
		
			System.out.println(Arrays.toString(c));
		
	}
}
