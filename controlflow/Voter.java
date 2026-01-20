import java.util.Scanner;
class Voter 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.print("enter your age : ");
		int age = sc.nextInt() ; 
		System.out.print("do you have voter id ? : ");
		char voterId = sc.next().charAt(0);
		
		if(age >= 18 &&  voterId=='y' )
		{
			System.out.println("you are eligible for vote");
		}
		else
		{
			System.out.println("you are not eligible");
		}
	}
}
