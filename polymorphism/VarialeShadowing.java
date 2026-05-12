

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
	public static void main(String[] args) 
	{
		B ob = new B();
		
		System.out.println(ob.x);
	}
}
