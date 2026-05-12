class Theri  
{
	public static String movieName;  // static variable
	
	public static void main(String[] args) 
	{
		
		// how to access static variables 
		
		System.out.println(movieName);
		
		System.out.println(Theri.movieName);
		
		Theri t1 = new Theri();
		
		System.out.println(t1.movieName);
	}
}
