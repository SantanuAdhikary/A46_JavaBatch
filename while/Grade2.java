
import java.util.Scanner;
class Grade2 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter your grade : ");
		char grade = sc.next().charAt(0);
		
		switch(grade)
		{
			case 'A' : System.out.println("excellent");
			           break;
					
			case 'B' : System.out.println("very good");
			           break;
			case 'C' : System.out.println("good");
			           break;
			case 'D' : System.out.println("Averege");
			           break;
			case 'F' : System.out.println("Fail");
			           break;
			default : System.out.println("invalid grade");
		}
	}
}
