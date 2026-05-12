class Student 
{
	public static void timewaste()
	{
		System.out.println("we are very happy by doing time waste");
	}
	
	public static void main(String[] args) 
	{
		timewaste();           // directly by the name  
		Student.timewaste();  // by using class
		
		Student s1 = new Student();
		s1.timewaste();     // by using object	
	}
}
