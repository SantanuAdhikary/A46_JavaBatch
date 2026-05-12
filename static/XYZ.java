class XYZ 
{
	static int a ; 
	static int b = 10 ; 
	
	static{
		System.out.println("hi");
	}
	
	public static void display()
	{
		System.out.println(a);
		test();
		System.out.println(b);
	}
	
	public static void test()
	{
		System.out.println("test");
	}

	public static void main(String[] args) 
	{
		System.out.println("start");
		display();
		System.out.println("end");
	}
	
	static
	{
		a = 50 ;
		b = 30;
	}
}
