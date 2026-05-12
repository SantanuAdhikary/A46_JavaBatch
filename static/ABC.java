class ABC 
{
	static int a ;
	static{
		System.out.println("i am Static multiline Initializers 1");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(a);
	}
	
	static{
		System.out.println("i am Static Multiline Initializers 2");
	//	a = 30 ;
	}
}
