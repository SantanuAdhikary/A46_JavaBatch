class CommonTwo 
{
	public static void main(String[] args) 
	{
		int a[] = {2,5,7,8,12,15};
		int b[] ={3,5,6,8,10};
		
		int i=0 , j = 0 ;
		
		while(i < a.length && j<b.length)
		{
			if(a[i] == b[j])
			{
				System.out.println(a[i]);
				i++;
				j++;
			}
			else if(a[i] < b[j])
				i++;
			else
				j++;
		}
		
		
	}
}
