interface Father
{
	int money =50;
}

class Mother
{
	double gold;
}

class Child extends Mother implements Father
{
}

class Multiple 
{
	public static void main(String[] args) 
	{
		
		Child c1 = new Child();
		
		System.out.println(c1.gold);
		System.out.println(c1.money);
	}
}
