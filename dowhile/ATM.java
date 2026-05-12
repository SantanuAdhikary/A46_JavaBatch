import java.util.Scanner;
class ATM 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		int option;
		int balance=1000;
		int pin = 1234;
		int amount = 0;
		int userPin;
		long phNo = 1234567890L;
		do{
		
		System.out.println("Welcome to ICICI Bank");
		System.out.println("1.Display \n2.Deposit \n3.Withdrawl \n4.change pin \n0.Exit");
		System.out.print("enter one option : ");
		option = sc.nextInt();
		
		switch(option)
		{
			case 1 : System.out.println("your balance is : "+balance);
			         break;
			
			case 2 : System.out.print("enter the amount : ");
			         amount = sc.nextInt();
					 System.out.print("enter your pin : ");
					 userPin = sc.nextInt();
					 
					 if(userPin == pin)
			         { 
						  balance = balance + amount;
						  System.out.println("amount deposited");
				
			          }
					  else{
						System.out.println("wrong pin");
					  }
					 
					 break;
					 
			case 3 : System.out.print("enter the amount : ");
			         amount = sc.nextInt();
					 System.out.print("enter the pin : ");
					 userPin = sc.nextInt();
					 
					 if(pin == userPin)
			         {
				            if(amount <= balance)
						 {
							 balance = balance - amount ; 
							 System.out.println("withdrawl done");
						 }
			         }
					 else{
						System.out.println("wrong pin");
					 }
					 
					 break;
					 
			case 4 : System.out.print("enter your phone number : ");
			         long userPhno = sc.nextLong();
					 if(phNo == userPhno)
			          {
						 int otp = (int) (Math.random() * 9000)+1000;
						 System.out.println("your otp is : "+otp);
						 System.out.print("enter your otp : ");
						 int userOtp = sc.nextInt();
						 if(otp == userOtp)
						  {
							
				          System.out.print("enter new Pin : ");
						  pin = sc.nextInt();
						  System.out.println("pin is updated");
						  }
						  else
						  {
							System.out.println("wrong otp");
						  }
			          }
					  else{
						System.out.println("wrong phone number ");
					  }
			         break;
			
			case 0 : System.out.println("bye bye");
			         break;
					 
			default: System.out.println("invalid option");
			 
			
		}
		}while(option!=0);
		
	}
}
