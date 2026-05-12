class A
{
}

class B extends A
{
}
class C extends B
{
}
class D extends C
{
}



class  Practice
{
	public static void main(String[] args) 
	{
		A aa  = new C();
		
		 B bb   = (B) aa;
		 
		 C cc = (C) aa;
		 
		 C cc1 = (C) bb;
		 
		// D dd = (D) aa ;
		 
		 System.out.println(aa instanceof D);
		 
		 
		 System.out.println("working");
	}
}
