import java.util.Scanner;
class Grade 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.print("enter your marks : ");
       int marks = sc.nextInt();
		
		
		if(marks >= 85 )
		{
			System.out.println("you got A grade");
		}
		
	   else if(marks>=60)
		{
			System.out.println("you got B grade");
		}
		
		else if(marks >=45)
		{
			System.out.println("you got C grade");
		}
		else if( marks >= 35)
		{
			System.out.println("you got D grade");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
