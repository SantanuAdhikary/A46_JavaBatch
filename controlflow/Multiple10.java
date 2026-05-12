import java.util.Scanner;
class Multiple10 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one number : ");
		int num = sc.nextInt();
		
		if(num % 10 == 0 )
		{
			System.out.println("it is multiple of 10");
		}
		else
		{
			System.out.println("it is not multiple of 10");
		}
	}
}
