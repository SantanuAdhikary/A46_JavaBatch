interface Father
{
	void responsibility();
}

interface GrandFather
{
	void storyTelling();
}

class Mother
{
	void care()
	{
		System.out.println("taking care of family");
	}
}




class Child  extends Mother implements Father,GrandFather
{
	@Override 
	 public void responsibility()
		{
			System.out.println("eat sleep repeat");
		}
		
	@Override
		public void storyTelling()
		{
			System.out.println("knows marvel story");
		}
}

class MultipleInheritance 
{
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.care();
		c.responsibility();
		c.storyTelling();
		
	}
}
