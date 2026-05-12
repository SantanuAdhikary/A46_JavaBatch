class FinalExample 
{
	
    final int  y ;
	
	FinalExample()
	{
		this.y = 40;
	}
	
	public static void main(String[] args) 
	{
		FinalExample ob = new FinalExample();

		final int Y = 30 ;
		
		System.out.println(ob.y);

		System.out.println(Integer.MAX_VALUE);
		
	}
}
