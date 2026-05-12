
class Animal
{
	void eat()
	{
		System.out.println("animal can eat");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("dogs are barking");
	}
}

class Puppy extends Dog
{
	void cry()
	{
		System.out.println("puppy is crying");
	}
}


class MultiLevel 
{
	public static void main(String[] args) 
	{
		
		Puppy p1 = new Puppy();
		
		p1.cry();
		p1.bark();
		p1.eat();
	}
}
