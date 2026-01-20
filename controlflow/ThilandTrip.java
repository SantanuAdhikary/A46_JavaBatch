import java.util.Scanner;
class  ThailandTrip
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("how much amount you have ? ");
		int amount = sc.nextInt();
		
		
		if(amount >= 25000)
		{
			System.out.println("yeeaahhhh hoooo...we can go to Thailand");
		}
	}
}
