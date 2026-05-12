import java.util.Arrays;
class MergeSortedArray 
{
	public static void main(String[] args) 
	{
		
		int a[] ={5,8,11};
		int b[] ={7,8,10,15,19,21};
		int c[] = new int[a.length+b.length];
		
		int i=0 , j =0 , k=0;
		
		// both the array haing some elemnts
		while(i<a.length && j<b.length)
		{
			if(a[i] < b[j])
			{
				c[k] = a[i];
				k++;
				i++;
			}
			else{
				c[k] = b[j];
				j++;
				k++;
			}
		}
		
		// b array having element
		
		while(j<b.length)
		{
			c[k] = b[j];
			k++;
			j++;
		}
		
		
		// a array havin elements
		
		while(i<a.length)
		{
			c[k] = a[i];
			i++;
			k++;
		}
		
		System.out.println(Arrays.toString(c));
	}
}
