class  Emp
{
	
	String ename;
	int eid;
	String companyName = "ABC";
	
	void empDetails()
	{
		System.out.println("employee name is  : "+ename);
		System.out.println("employee id is  : "+eid);
		System.out.println("company name is : "+companyName);
	}
	
	public static void main(String[] args) 
	{
		Emp e1 = new Emp();
		e1.ename = "miller";
		e1.eid = 2023;
		
		e1.empDetails();
		
		System.out.println("------------------------------");
		
		Emp e2 = new Emp();
		e2.ename = "scott";
		e2.eid = 2025;
		e2.empDetails();
	}
}
