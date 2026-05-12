
import java.util.*;
class User
{
	String userName;
	long phNo;
	int userId;
	
	User(String userName, long phNo, int userId)
	{
		this.userName = userName;
		this.phNo = phNo;
		this.userId = userId;
	}
	
	void userDetails()
	{
		System.out.println("\t\t\tuser Details");
		System.out.println("\t\tuser name is : "+userName);
		System.out.println("\t\tuser phone number is : "+phNo);
		System.out.println("\t\tuser id is : "+userId);
	}
}

class Product
{
	String productName;
	double productPrice;
	
	Product(String productName, double productPrice)
	{
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	void productDetails()
	{
		System.out.println("\t\t\tproduct Details");
		System.out.println("\t\tproduct name is : "+productName);
		System.out.println("\t\tproduct price is : "+productPrice);
	}
}

interface Payment
{
	String pay(double amount);
}

class UPI implements Payment
{
    @Override
		public String pay(double amount){
			return "payment done by UPI "+amount+ " rs";
		}
}

class Card implements Payment
{
	@Override
		public String pay(double amount){
			return "payment done by Card "+amount+ " rs";
		}
}

class Cash implements Payment
{
	@Override
		public String pay(double amount){
			return "payment done by cash "+amount+ " rs";
		}
}

class EcomApp 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		User user1 = new User("Jhon",1234567890,101);
		user1.userDetails();
		
		Product p1 = new Product("Laptop",72000);
		p1.productDetails();
		
		System.out.print("enter your payment method : ");
		String paymentMethod = sc.next();
	
		Payment payment=null;
		
		if(paymentMethod.toLowerCase().equals("upi"))
		{
			 payment= new UPI();
		}
		else if(paymentMethod.toLowerCase().equals("card"))
		{
			 payment = new Card();
		}
		else if(paymentMethod.toLowerCase().equals("cash"))
		{
			 payment = new Cash();
		}
		else
		{
			System.out.println("wrong payment method");
		}
		
		System.out.println(payment.pay(p1.productPrice));
	}
}
