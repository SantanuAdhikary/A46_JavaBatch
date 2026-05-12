
@FunctionalInterface
interface A
{
	
	void m1();
	//void m2();
	
	public static void m5()
	{}
	public static void m6()
	{}
}

class B implements A
{
	@Override 
		public void m1(){
			System.out.println("m1");
		}
		
	
}

class Functional 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
