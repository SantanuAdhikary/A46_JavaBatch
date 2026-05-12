import java.util.Scanner;
class ATM 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("1.Check Balance \n2.Deposit \n3.Withdrawl \n4.Change pinno");
		
		
		System.out.print("select any option : ");
		
		int option = sc.nextInt();
		
		double balance = 6.67;
		
		long regPhno = 123;
		
		
		int pinno = 1010;
		
		
		switch(option)
		{
			case 1 : System.out.println("welcom Mr. Virat Kohli");
			         System.out.println("you have "+balance +" rs in your bank account");
			         break;
					 
			case 2 : System.out.print("enter the amount you want to deposit : ");
			         double deposit = sc.nextDouble();
					 balance = balance + deposit;
					 System.out.println("deposit done successfully");
					 System.out.println("your current balance is : "+balance+" rs");
			         break;
					 
			case 3 : 
				     System.out.print("enter your pin : ");
			         int userpin = sc.nextInt();
					 
					 if(userpin == pinno)
			           {
				             System.out.print("enter the amount you want to withdrawl : ");
			          double withdrawl = sc.nextDouble();
					  
					  if(withdrawl <= balance)
			           {
			              balance = balance - withdrawl;
						  System.out.println("after withdrawl your current amount is : "+balance + " rs");
			           }
					   else
			           {
				               System.out.println("insufficient balance");
			           }
			         
			           }
					   
					   else{
						  System.out.println("wrong pin no");
					   }
				
			break;
					 
			case 4 : 
				      System.out.print("enter your registered phone number : ");
			           long phno = sc.nextLong();
					   
					   if(regPhno == phno)
			            {
				             int otp = (int) (Math.random()*9000) + 1000;
							 System.out.println("your otp is : "+otp);
							 System.out.print("enter the otp : ");
							 int userOtp = sc.nextInt();
							 
							 if(otp == userOtp)
							{
								System.out.print("enter your updated pin : ");
								 int newpin = sc.nextInt();
								 pinno = newpin ; 
								 System.out.println("your pin code has been updated");
								 System.out.println("pincode is : "+pinno);
							}
							else
							{
								System.out.println("wrong otp");
							}
			            }
						else
		             	{
				            System.out.println("wrong mobile number");
			            }
			          break;
					  
			default : System.out.println("give valid option");
		}
		
	}
}
