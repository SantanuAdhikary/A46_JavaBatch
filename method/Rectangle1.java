class Rectangle1 
{
	public static int area(int l , int b)
	{
		int a = l * b ; 
		
		return a ;
	}
	
	public static int perimeter(int l , int b)
	{
		int p = 2 * (l + b);
		
		return p;
	}
	
	public static void main(String[] args) 
	{
	  int ans =	area(100,20);
	  
	  System.out.println("area is : "+ans);
	  
	 int ans2 =  perimeter(150,50);
	 System.out.println("perimeter is : "+ans2);
	 
	 
	  area(200,20);
	}
}
