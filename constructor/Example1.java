class  Example1
{
	String sname ; 
	int age ;
	
	// non parameterized constructor
	Example1()
	{
		
		// load the instruction 
		
		// programmer written statement
		
		sname = "virat";
		age = 10;
		System.out.println("my both work done");
	}
	
	void display()
	{
		System.out.println("student name is : "+sname);
		System.out.println("student age is : "+age);
	}
	
	public static void main(String[] args) 
	{
		Example1 ob = new Example1();
		ob.display();
		
	}
}
