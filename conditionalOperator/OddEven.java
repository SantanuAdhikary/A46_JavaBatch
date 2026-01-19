import java.util.Scanner;
class OddEven 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one number : ");
		int num = sc.nextInt();
		
	 String ans =	num % 2 == 0 ? "it is even" : "it is odd";
	 
	 System.out.println(ans);
	}
}
