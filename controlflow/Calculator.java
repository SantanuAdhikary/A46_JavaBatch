import java.util.Scanner;
class Calculator 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
		
		System.out.print("enter your choice : ");
		int choice = sc.nextInt();
		
		
		
		switch(choice)
		{
			case 1 : System.out.println("welcome to addition Operation");
			         System.out.print("enter first number : ");
					double num1 = sc.nextDouble();
					System.out.print("enter second number : ");
					double num2 = sc.nextDouble();
			         System.out.println("result is : "+(num1+num2));
			          break;
			        
			case 2 : System.out.println("welcome to subtraction Operation");
					System.out.print("enter first number : ");
					double num3 = sc.nextDouble();
					System.out.print("enter second number : ");
					double num4 = sc.nextDouble();
			          System.out.println("result is : "+(num3-num4));
					 break;
					 
			case 3 : System.out.println("welcome to multiplication Operation");
					System.out.print("enter first number : ");
					double num5 = sc.nextDouble();
					System.out.print("enter second number : ");
					double num6 = sc.nextDouble();
			          System.out.println("result is : "+(num5*num6));
					 break;
					 
			case 4 : System.out.println("welcome to division Operation");
					System.out.print("enter first number : ");
					double num7 = sc.nextDouble();
					System.out.print("enter second number : ");
					double num8 = sc.nextDouble();
			          System.out.println("result is : "+(num7 / num8));
					 break;
			
			default : System.out.println("invalid choice");
		}
	}
}
