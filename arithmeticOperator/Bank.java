
import java.util.Scanner;
class Bank 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		int amount = 10000;
		
		System.out.println("you have "+amount);
		
		System.out.print("enter the deposit amount : ");
		int deposit = sc.nextInt();
		
		int totalAmount = amount + deposit;
		
		System.out.println("now you have "+totalAmount);
	}
}
