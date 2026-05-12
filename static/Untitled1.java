class ATM 
{
	static String bank = "ICICI" ; // static single line initiazers
	static int amount ;           // static variable 
	
	public static void display()
	{
		System.out.println("bank name is : "+bank);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("start");
		System.out.println(bank);
		display();
		System.out.println(amount);
		
	}
}
