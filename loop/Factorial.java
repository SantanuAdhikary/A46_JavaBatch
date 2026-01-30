import java.util.Scanner;
class Factorial 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one number : ");
		int n = sc.nextInt();
		
		int fact = 1;
		
		for(int i=1 ; i<=n ; i++)
		{
			fact = fact * i ;
		}
		
		System.out.println("factorial is : "+fact);
	}
}
