
import java.util.Scanner;
class PosNegOddEven 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one number : ");
		int num = sc.nextInt();
		
		
	  String ans =	num >=0 ? num%2==0? "pos even" : "pos odd" : num%2 == 0 ? "neg even" : "neg odd";
	  
	  System.out.println(ans);
	  
	  
	}
}
