class MethodOverload 
{
	public static void m1(double a , float b)
	{
		System.out.println("third");
		System.out.println(a +" , "+b);
	}
	
	public static void m1(float a , double b)
	{
		System.out.println("second");
		System.out.println(a +" , "+b);
	}
	
	
	public static void main(String[] args) 
	{
		m1(10,20);
	}
}
