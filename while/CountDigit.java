import java.util.Scanner;
class CountDigit 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one number : ");
		int num = sc.nextInt();
		int count = 0 ;
		
		while(num > 0)
		{
			num = num / 10 ; 
			count++;	
		}
		
		System.out.println("no of digits is : "+count);
	}
}
