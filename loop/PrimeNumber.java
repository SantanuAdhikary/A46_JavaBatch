import java.util.Scanner;
class  PrimeNumber
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one number : ");
		int n = sc.nextInt();
		
		int count = 0 ;
		
		for(int i=1 ; i<=n ;i++)
		{
			if(n % i == 0)
				count++;				
		}
		
		if(count == 2 )
			System.out.println("it is prime number");
		else
			System.out.println("it is not prime number");
	}
}
