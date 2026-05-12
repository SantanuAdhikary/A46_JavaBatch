class Engine
{
	void start()
	{
		System.out.println("engine starts");
	}
}

class MusicPlayer
{
	void music()
	{
		
		System.out.println("kurchi madathapetti");
	}
}

class Car
{
	Engine engine = new Engine(); // composition
	Car()
	{
		engine.start();  // composition
		System.out.println("car (alto) manufactured");
	}
	
	Car(MusicPlayer player1)
	{
		engine.start();    // composition
		player1.music();  // aggregation
		System.out.println("car (bmw) manufactured");
	}
	
	
}


class  Factory
{
	public static void main(String[] args) 
	{
		Car car1 = new Car();
		System.out.println("----------------------------");
		Car car2 = new Car();
		
		System.out.println("----------------------------");
		
		MusicPlayer music_player = new MusicPlayer();
		
		Car car3 = new Car(music_player);
	}
}
