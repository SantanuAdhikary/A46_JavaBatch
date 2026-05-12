class  Calculator
{
	
	void add()
	{
		System.out.println(10+50);
	}

	void add(int a , int b)
	{
		System.out.println(a+b);
	}
	
	void add(float a, float b)
	{
		System.out.println(a+b);
	}
	
	void add(float a , int b , int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		c.add();
		c.add(35,45);
		c.add(10.9f, 12.1f);
		c.add(10.5f , 90,12);
	}
}
