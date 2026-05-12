import java.util.Scanner;
class Triangle 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter first angle : ");
		int a = sc.nextInt();
		
		System.out.print("enter second angle : ");
		int b = sc.nextInt();
		
		System.out.print("enter third angle : ");
		int c = sc.nextInt();
		
		if(a+b+c == 180)
		{
			System.out.println("it is valid triangle");
		}
		else
		{
			System.out.println("invalid triangle");
		}
	}
}
