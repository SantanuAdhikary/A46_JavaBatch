
class Animal
{
	String color ;
}

class Dog extends Animal
{
}


class Relationship 
{
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		d.color = "black and white";
		System.out.println(d.color);
	}
}
