class Animal
{
	final void eat()
	{
		System.out.println("can eat");
	}
}

class Dog extends Animal
{
	@Override
	void eat()
	{
		System.out.println("can not eat");
	}
}


class FinalMethod 
{
	public static void main(String[] args) 
	{
		
		Animal a = new Animal();
		a.eat();
		
		Dog d = new Dog();
		d.eat();
	}
}
