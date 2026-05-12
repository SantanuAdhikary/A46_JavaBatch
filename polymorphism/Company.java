
import java.util.Scanner;
class Employee
{
	private String ename;
	private int eid;
	private long phno;
	private double sal;
	
	Employee(String ename,int eid,long phno,double sal)
	{
		this.ename = ename;
		this.eid = eid;
		this.phno = phno;
		this.sal = sal;
	}
	
	//ename
	
	public String getEname()
	{
		return ename;
	}
	
	public void setEname(String ename)
	{
		this.ename = ename;
	}
	
	// eid 
	
	public int getEid()
	{
		return eid;
	}
	
	public void setEid(int eid)
	{
		this.eid = eid;
	}
	
	// sal 
	
	public double getSal()
	{
		return sal;
	}
	
	public void setSal(double sal)
	{
		this.sal =sal;
	}
	
	// phno
	
	public long getPhno()
	{
		return phno;
	}
	
	public void setPhno(long phno)
	{
		this.phno = phno;
	}
	
	
	void displayDetails()
	{
		System.out.println("ename is : "+getEname());
		System.out.println("eid is : "+getEid());
		System.out.println("phone number is : "+getPhno());
		System.out.println("salary is : "+getSal());
	}
}


class Developers extends Employee
{
	String skills[] = new String[3];
	Developers(String ename,int eid,long phno,double sal,String[] skills)
	{
		super(ename,eid,phno,sal);
		for(int i=0 ; i<3 ; i++)
		{
			this.skills[i] = skills[i];
		}
	}
	
	void displayDetails(int a)
	{
		super.displayDetails();
		System.out.print("Developers skills are : ");
		for(String skill : skills)
		{
			System.out.print(skill +" ");
		}
	}
}

class TestEngineer extends Employee
{
	String testingTools[] = new String[3];
	
	TestEngineer(String ename,int eid,long phno,double sal,String[] testingTools)
	{
		super(ename,eid,phno,sal);
		
		for(int i=0 ; i<3 ; i++)
		{
			this.testingTools[i] = testingTools[i];
		}
	}
	
	void displayDetails()
	{
		
		super.displayDetails();
		System.out.println("tools used by test engineer ");
		for(int i=0 ; i<3 ; i++)
		{
			System.out.println(testingTools[i]);
		}
	}
}

class  Company
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
	    System.out.println("1.Developer \n2.Test Engineer");
		System.out.print("select any one option : ");
		int option = sc.nextInt();
		String ename;
		int eid;
		double sal;
		long phNo;
		Employee e1 = null;
		
		switch(option)
		{
			case 1 : System.out.print("enter your name : ");
			         ename = sc.next();
					 System.out.print("enter you eid : ");
					 eid = sc.nextInt();
					 System.out.print("enter salary : ");
					 sal = sc.nextDouble();
					 System.out.print("enter phone number : ");
					 phNo = sc.nextLong();
					 String skills[] = new String[3];
					 System.out.println("enter skills : ");
					 for(int i=0 ; i<3 ; i++)
			         {
				       skills[i] =sc.next();
			         }
					 e1= new Developers(ename,eid,phNo,sal,skills);
					 
					 break;
			
			case 2 : System.out.print("enter your name : ");
					 ename = sc.next();
					 System.out.print("enter you eid : ");
					 eid = sc.nextInt();
					 System.out.print("enter salary : ");
					 sal = sc.nextDouble();
					 System.out.print("enter phone number : ");
					 phNo = sc.nextLong();
					 String tools[] = new String[3];
					 System.out.println("enter tools you are using : ");
					 for(int i=0 ; i<3 ; i++)
			         {
				       tools[i] =sc.next();
			         }
					 e1 = new TestEngineer(ename,eid,phNo,sal,tools);
					 break;
			
			default : System.out.println("invalid option");
							       
		}
		
		if(e1 instanceof Developers)
		{
			Developers d = (Developers) e1;
			d.displayDetails();
		}
		
		if(e1 instanceof TestEngineer)
		{
			TestEngineer t = (TestEngineer) e1;
			t.displayDetails();
		}
		
		
	}
}
