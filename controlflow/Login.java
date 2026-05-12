import java.util.Scanner;
class Login 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		long regNo = 1234567890L;
		
		System.out.print("enter your registered mobile number : ");
		long phNo = sc.nextLong();
		
		if(regNo == phNo)
		{
			
			int otp = (int) (Math.random()*9000) + 1000;
			System.out.println("your otp is : "+otp);
			
			System.out.print("enter the correct otp " );
			int userOtp = sc.nextInt();
			
			if(otp == userOtp)
				System.out.println("login done successfully");
			else
				System.out.println("see the otp and type");
		}
		else
		{
			System.out.println("wrong credentials");
		}
	}
}
