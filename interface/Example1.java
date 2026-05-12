
interface Vehicle
{
	void stop();
}

class Car implements Vehicle
{
	@Override
		public void stop()
		{
			System.out.println("car has stopped");
		}
}

class Example1 
{
	public static void main(String[] args) 
	{
		
		Car c1 = new Car();
		c1.stop();
		
		Vehicle v1 = new Car();
		v1.stop();
		
	}
}
