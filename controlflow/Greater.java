import java.util.Scanner;
class  Greater
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter first number ");
		
		double num1 = sc.nextDouble();
		
		System.out.print("enter second number : ");
		
		double num2 = sc.nextDouble();
		
		if(num1 > num2)
		{
			
			System.out.println("greater is : "+num1);
		}
		else
		{
			System.out.println("greater is : "+num2);
		}
	}
}
