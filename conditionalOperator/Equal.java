import java.util.Scanner;
class Equal 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter first number : ");
		int num1 = sc.nextInt();
		
		System.out.print("enter second number : ");
		int num2 = sc.nextInt();
		
		
	 String ans =  num1 == num2 ? "both are equal" : num1>num2 ? "num1 is greater" : "num2 is greater";
	 
	 
	 System.out.println(ans);
	}
}
