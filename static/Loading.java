class  Loading
{
	static int a ; 
	static int b = 10 ; 
	
	static
	{
		System.out.println(b);
		a = 20 ; 
		b = 30;
	}
	
	public static void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	static int c ;
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		display();
		System.out.println(c);
		System.out.println("end");
	}
	
	static{
		System.out.println(a);
		c=40;
		a=50;
	}
}
