class Student 
{
	String sname ; 
	int age ; 
	long phNo;
    String address;
	char gender;
	String course ; 
	String bloodGroup;
	
	void study()
	{
		System.out.println("we don't love to study");
	}
	void sleep()
	{
		System.out.println("we love to sleep");
	}
	void play()
	{
		System.out.println("we love to play");
	}
	
	public static void main(String[] args)
	{
		Student s1 = new Student();
		System.out.println(s1);
		
		s1.sname = "Dinga";
		s1.age = 13;
		s1.phNo = 9087654321L;
		s1.address="chennai";
		s1.course = "be";
		s1.gender = 'M';
		s1.bloodGroup = "O+";
		
		System.out.println("student name is : "+s1.sname);
		System.out.println("student age is : "+s1.age);
		System.out.println("student phone number is : "+s1.phNo);
		System.out.println("student address is : "+s1.address);
		System.out.println("student course is : "+s1.course);
		System.out.println("student gender is : "+s1.gender);
		System.out.println("student blood group is : "+s1.bloodGroup);
		
		s1.sleep();
		System.out.println("===================================");
		
		
		
		Student s2 = new Student();
		System.out.println(s2);
		
		s2.sname = "Dingi";
		s2.age = 15;
		s2.phNo = 1234567890L;
		s2.address = "madurai";
		s2.gender = 'F';
		s2.course = "bca";
		s2.bloodGroup = "A-";
		
		System.out.println("student name is : "+s2.sname);
		System.out.println("student age is : "+s2.age);
		System.out.println("student phone number is : "+s2.phNo);
		System.out.println("student address is : "+s2.address);
		System.out.println("student course is : "+s2.course);
		System.out.println("student gender is : "+s2.gender);
		System.out.println("student blood group is : "+s2.bloodGroup);
		s2.play();
		
		
	}
	
}
