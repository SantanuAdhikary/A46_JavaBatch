class Vehicle
{
	String color ; 
    String brand;
}

class Bike extends Vehicle
{
	int wheels = 2 ;
}

class Car extends Vehicle
{
	int window = 4;
}

class Hierarchical 
{
	public static void main(String[] args) 
	{
		Bike b1 = new Bike();
		System.out.println(b1.wheels);
		System.out.println(b1.color);
		//System.out.println(b1.window); not possible 
		
		
		Car c1 = new Car();
		System.out.println(c1.window);
		System.out.println(c1.brand);
		//System.out.println(c1.wheels); not possible
	}
}
