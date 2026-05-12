import java.util.Scanner;
class  EvenOdd
{
	static Scanner sc = new Scanner(System.in);
	
	
	public static boolean isEven(int n)
	{
		if(n % 2 == 0)
			return true;	
		
		return false;
	}
	
	
	public static void main(String[] args) 
	{
		System.out.print("enter one number : ");
		int n = sc.nextInt();
		
		boolean ans = isEven(n);
		
		System.out.println(ans);
		
		if(ans)
			System.out.println("it is even");
		else 
			System.out.println("it is odd");
			
		
		
	}
}
