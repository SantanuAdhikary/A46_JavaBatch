class NonstaticInitializers 
{
	
	int a ;              // non static variable 
	String b = "hi" ;   // single line non static initializers
	
	void m1()
	{
		System.out.println("i am m1");   // non static method
	}
	
	{
		
		System.out.println("i am mlnsi 1");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!"	);
		
		NonstaticInitializers ns1 = new NonstaticInitializers();
		
		System.out.println(ns1.a);
		System.out.println(ns1.b);
		ns1.m1();
	}
	
	{
		
		System.out.println("i am mlnsi 2");
	}
}
