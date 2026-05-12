interface ABC
{
	void m2();
	public static void m1()
	{
		System.out.println("i am static method of interface");
	}
}

class GHI 
{
	public static void m3()
	{
		System.out.println("i am static m3 from GHI class");
	}
}

class DEF extends GHI implements ABC
{
	@Override 
		public void m2()
		{
			System.out.println("i am m2 from ABC interface");
		}
}


class TypesOfInterface
{
	public static void main(String[] args) 
	{
	       System.out.println("\t\t\twelcome");	
		   ABC.m1();
		   
		   DEF ob = new DEF();
		   ob.m2();
		   ob.m3();
		   ob.m1();
	}
}
