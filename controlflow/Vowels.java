import java.util.Scanner;
class Vowels 
{
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one letter : ");
		char ch = sc.next().charAt(0);
		
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
		|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch== 'U')
		{
			System.out.println("it is vowel");
		}
		else
		{
			System.out.println("it is consonant");
		}
	}
}
