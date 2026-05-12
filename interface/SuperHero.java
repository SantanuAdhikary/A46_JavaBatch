class Bird
{
	void fly()
	{
		System.out.println("can fly");
	}
}

interface Animal
{
	void run();
	
}

interface Fish
{
	void swim();
	
}

class  SuperHero extends Bird implements Fish , Animal
{
	@Override
		public void run()
		{
		System.out.println("can run");
	    }
		
	@Override
		public void swim()
		{
		System.out.println("can swim");
	    }
	
	public static void main(String[] args) 
	{
		SuperHero s = new SuperHero();
		s.swim();
		s.run();
		s.fly();
	}
}
