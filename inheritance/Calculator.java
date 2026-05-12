
class Addition
{
	Addition()
	{  
		this(100,2000,400);
		System.out.println(10+20);
		
	}
	Addition(int a , int b)
	{
		System.out.println(a + b);
	}
	
	Addition(int a , int b , int c)
	{
		this(300,100);
		System.out.println(a + b + c);
	}
	
	void m1()
	{
		
		System.out.println("i am m1");
	}
	
	
}


class Calculator 
{
	public static void main(String[] args) 
	{
		Addition a1 = new Addition();
	
		
	}
}
