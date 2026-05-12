
class Calculator
{
	public static void add(int a , int b)
	{
		int sum = a + b ; 
		System.out.println(sum);
	}
	
	public static void sub(int a , int b)
	{
	   System.out.println(a-b);	
	}
	
	public static void multiply(int a , int b)
	{
		System.out.println(a * b);
	}
	
	public static void division(int a , int b)
	{
		System.out.println(a / b);
	}
	
	public static void main(String[] args)
	{
		add(20,80);
		sub(100,30);
		multiply(20,10);
		division(100,20);
		
		add(500,900);
	}
}
