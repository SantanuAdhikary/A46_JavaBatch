class  Colors
{
	public static void main(String[] args) 
	{
		String colors[] = {"red","pink","black","green","blue","white"};
		
		int n = colors.length;
		
		for(int i=0 ; i<n ; i++)
		{
			System.out.println(colors[i]);
		}
		
		System.out.println("printing in reverse order");
		
		for(int i=n-1 ; i>=0 ; i--)
		{
			System.out.println(colors[i]);
		}
	}
}
