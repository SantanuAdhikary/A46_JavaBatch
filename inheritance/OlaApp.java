import java.util.Scanner;
class Ride
{
	String pickup;
	String drop;
	int distance;
	
	Ride(String pickup, String drop, int distance)
	{
		this.pickup = pickup;
		this.drop = drop;
		this.distance = distance;
	}
	
	void rideDetails()
	{
		System.out.println("pickup is : "+pickup);
		System.out.println("drop is : "+drop);
		System.out.println("distance is : "+distance);
		
	}
}

class Auto extends Ride
{
	
	String driverName = findDriver();
	int price = 30;
	Auto( String pickup, String drop, int distance)
	{
	   super(pickup,drop,distance);
	   
	}
	
	String findDriver()
	{
		String names[] ={"rohit","virat","iyer","pant","dhoni","jaddu","bumrah","bhuvi","hardik","suriya"};
		int index = (int) (Math.random()*10);
		
		return names[index];
	}
	
	void autoDetails()
	{
		System.out.println("driver name is : "+driverName);
		System.out.println("total ride cost : "+(price*distance));
	}
		
	
}
class Bike extends Ride
{
	String driverName = findDriver();
	int price = 20;
	Bike( String pickup, String drop, int distance)
	{
	   super(pickup,drop,distance);
	  
	   
	}
	String findDriver()
	{
		String names[] ={"rohit","virat","iyer","pant","dhoni","jaddu","bumrah","bhuvi","hardik","suriya"};
		int index = (int) (Math.random()*10);
		
		return names[index];
	}
	void bikeDetails()
	{
		System.out.println("driver name is : "+driverName);
		System.out.println("total ride cost : "+(price*distance));
	}
		
	
}
class Car extends Ride
{
	String driverName = findDriver();
	int price = 50;
	Car( String pickup, String drop, int distance)
	{
	   super(pickup,drop,distance);
	   
	   
	}
	
	String findDriver()
	{
		String names[] ={"rohit","virat","iyer","pant","dhoni","jaddu","bumrah","bhuvi","hardik","suriya"};
		int index = (int) (Math.random()*10);
		
		return names[index];
	}
	void carDetails()
	{
		System.out.println("driver name is : "+driverName);
		System.out.println("total ride cost : "+(price*distance));
	}
		
	
}

class  OlaApp
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("1.Auto \n2.Bike \n3.Car");
		System.out.print("enter one option : ");
		int option = sc.nextInt();
		
		Ride r =null;
		
		switch(option)
		{
			case 1 :    r =  new Auto("arumbakkam","vadapalani",2);
			               break;
						   
			case 2 :    r =   new Bike("ashoknagar","vadapalani",5);
			               break;
						   
			case 3 :    r =   new Car("sholinganallur","vadapalani",15);
			               break;
			
			default :     System.out.println("wrong option");
		}
		
		r.rideDetails();
		
		
		if(r instanceof Bike)
		{
			Bike b = (Bike) r ; 
			b.bikeDetails();
		}
		else if(r instanceof Car)
		{
			Car c = (Car) r ; 
			c.carDetails();
		}
		else if(r instanceof Auto)
		{
			Auto a = (Auto) r;
			a.autoDetails();
		}
		
	}
}
