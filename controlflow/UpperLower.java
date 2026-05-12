import java.util.Scanner;
class  UpperLower
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter any character A-Z or a-z : ");
		char ch = sc.next().charAt(0);
		
		if(ch >='A' && ch<= 'Z')
		{
			System.out.println("it is uppercase");
		}
		else
		{
			System.out.println("it is lowercase");
		}
	}
}
