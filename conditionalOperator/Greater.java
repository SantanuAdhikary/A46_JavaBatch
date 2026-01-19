import java.util.Scanner;
class Greater 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter first number : ");
		int num1 = sc.nextInt();
		
		
		System.out.print("enter second number : ");
		int num2 = sc.nextInt();
		
		
	   int ans =	num1 > num2 ? num1 : num2 ;
	   
	   System.out.println(ans);
	}
}
