import java.util.Scanner;
class LeapYear 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one year : ");
		int year = sc.nextInt();
		
	String ans=	year % 100==0 ? year % 400 == 0 ? "leap year" : "not leap year" : year % 4 == 0 ? "leap year " : "not leap year"; 
	
	System.out.println(ans);
	}
}
