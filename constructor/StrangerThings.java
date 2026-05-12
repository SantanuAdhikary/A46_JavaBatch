class  StrangerThings
{
	String characterName;
	int age ;
	char gender ;
	
	StrangerThings(String name , int vayathu, char g )
	{
		characterName = name;
		age = vayathu;
		gender = g;
	}
	
	void displayDetails()
	{
		System.out.println("name is : "+characterName);
		System.out.println("age is : "+age);
		System.out.println("gender is : "+gender);
		
	}
	
	public static void main(String[] args) 
	{
		
		StrangerThings st1 = new StrangerThings("vecna",32,'M');
		st1.displayDetails();
		
		
		StrangerThings st2 = new StrangerThings("max",21,'F');
		st2.displayDetails();
		
		StrangerThings st3 = new StrangerThings(20,"will",'M');
		st3.displayDetails();
		
	}
}
