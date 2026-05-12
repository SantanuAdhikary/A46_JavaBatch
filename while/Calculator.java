import java.util.Scanner;
class Calculator 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		char ch;
	 do{	
		System.out.println(" + : Addition  \n - : Subtraction \n * : Multiplication \n / : Division \n # : Exit");
		System.out.print("enter one character : ");
		 ch = sc.next().charAt(0);
		
	    switch(ch)
		{
			case '+' : System.out.println("addition");
				       break;
			case '-' : System.out.println("subtraction");
			           break;
			case '*' : System.out.println("multiplication");
			           break;
			case '/' : System.out.println("division");
			           break;
					   
			case '#' : System.out.println("bye bye");
			           break;
					   
			default : System.out.println("invalid option");
		}
	 } while(ch !='#');
	}
}
