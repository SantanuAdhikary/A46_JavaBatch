
import java.util.Scanner;
class Power2 
{
	static Scanner sc = new Scanner(System.in);
	
	public static int power(int b , int p)
	{	
		int mul = 1; 	
		for(int i=1 ; i<=p ; i++)
		{
			mul = mul * b ;
		}		
		return mul;
	}
	
	public static void main(String[] args) 
	{
		System.out.print("enter base value : ");
		int b  = sc.nextInt();
		System.out.print("enter power value : ");
		int p  = sc.nextInt();
		
	System.out.println(	power(b,p));
		
	}
}
