

class A
{
	int x = 10 ;
}

class B extends A
{
	int x = 30 ;
}


class  VariableShadowing
{
	
	static String sname = "rahul";
	
	static void m1()
	{
		String sname = "hardik";
		System.out.println(sname);
	}
	
	public static void main(String[] args) 
	{
		B ob = new B();
		
		System.out.println(ob.x);
		
		m1();
	}
}
