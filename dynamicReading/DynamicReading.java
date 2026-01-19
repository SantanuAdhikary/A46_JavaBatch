
import java.util.Scanner;

class DynamicReading 
{
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("enter your name : ");
		String name  = sc.next();
		
		System.out.println("enter your age : ");
		int age = sc.nextInt();
		
		System.out.println("enter your gender : ");
		char gender = sc.next().charAt(0);
		
		System.out.println("your name is "+name);
		System.out.println("your age is "+age);
		System.out.println("your gender is :"+gender);
	
	}
}
