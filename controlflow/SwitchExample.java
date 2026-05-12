
import java.util.Scanner;
class SwitchExample 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one data");
		char a = sc.next().charAt(0);
		
		switch(a)
		{
			case '+' : System.out.println("hi");
			             break;
			case '-' : System.out.println("bye");
			             break;
		     default : System.out.println("no true no false");
		}
	}
}
