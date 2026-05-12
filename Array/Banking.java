import java.util.Scanner;
interface Payment
{
	void pay();
}

class Netbanking implements Payment
{
	public void pay()
	{
		System.out.println("paying by using netbanking");
	}
}
class UpiPayment implements Payment
{
	public void pay()
	{
		System.out.println("paying by using upiPayment");
	}
}

class checkOut
{
	void processPayment(Payment payment)
	{
		payment.pay();
	}
}

class Banking 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Netbanking n = new Netbanking();
		UpiPayment u = new UpiPayment();
		
		checkOut c = new checkOut();
		
		System.out.println("1.Netbanking \n2.UPI");
		System.out.print("enter payment mode : ");
		int option = sc.nextInt();
		
		switch(option)
		{
			case 1 : c.processPayment(n);
			         break;
			case 2 : c.processPayment(u);
			         break;
		   default : System.out.println("invalid option");
		}
		
		
	}
}
