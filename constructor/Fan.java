class Thala
{
	public static Thala t;
	String name ; 
	private Thala()
	{
		System.out.println("I am the only one thala");
	}
	
	public static Thala createThala()
	{
		if(t == null)
			t = new Thala();
		
		return t;
	}
}

class  Fan
{
	public static void main(String[] args) 
	{
		/*Thala t1 = new Thala("Ajith");
		System.out.println(t1.name);
		
		Thala t2 = new Thala("Dhoni");
		System.out.println(t2.name);  */
		
		Thala t1 = Thala.createThala();
		System.out.println(t1);
		
		Thala t2 = Thala.createThala();
		System.out.println(t2);
		Thala t3 = Thala.createThala();
		System.out.println(t3);
	}
}
