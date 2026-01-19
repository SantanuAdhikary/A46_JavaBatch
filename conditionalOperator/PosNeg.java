
import java.util.Scanner;
class PosNeg 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one number : ");
		int num = sc.nextInt();
		
	 String ans =	num >= 0 ? "it is positive " : "it is negative"; 
	 
	 System.out.println(ans);
	}
}
