
class Parent
{
	String bike ; 
	double money ;
	
	void parentDetails()
	{
		System.out.println(bike);
		System.out.println(money);
	}
}

class Child extends Parent
{
	String mobile ; 
	
	void childDetails()
	{
		System.out.println(mobile);
	}
}

class Child2 extends Parent
{
	String laptop;
	
	void child2Details()
	{
		System.out.println(laptop);
	}
}


class TypeCasting 
{
	public static void main(String[] args) 
	{
		Parent p1 = new Parent();
		p1.parentDetails();
//		p1.childDetails();  not possible 

        Child c1 = new Child();
		c1.childDetails();
		c1.parentDetails();
		
		
		System.out.println("--------------------upcasting--------------");
		
		 Parent p2 =  new Child();   // upcasting 
		 p2.parentDetails();
		
		 //p2.childDetails();   // not possible 
		 
		System.out.println("----------------------------------");
		Child2 c2 = new Child2();
		c2.child2Details();
		
		 Parent p3 =     new Child2();
		 p3.parentDetails();
		// p3.child2Details();
		
		
		Child2 c3 = (Child2) p3;
	}
}
