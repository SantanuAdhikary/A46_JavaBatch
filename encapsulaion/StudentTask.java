
import java.util.Arrays;
import java.util.Scanner;
class Student
{
	static Scanner sc = new Scanner(System.in);
	
	// data hiding 
	private String sname;
	private int sid;
	private int marks[] = new int[5];
	private long phNo;
	
	// parameterized constructor
	
	Student(String sname , int sid , int[] marks, long phNo)
	{
		this.sname = sname;
		this.sid = sid;
		this.phNo = phNo;
		
		// assigning the user given array value inside the student class marks array
		for(int i=0; i<marks.length;i++)
		{
			this.marks[i] = marks[i];
		}
	}
	
	// getter for sname 
	
	public String getSname()
	{
		return sname;
	}
	// getter for sid
	public int getSid()
	{
		return sid;
	}
	
	// getter for phNo
	public long getPhNo()
	{
		return phNo;
	}
	
	
	
	// setter method for phNo
	
	public void setPhNo(long phNo)
	{
		if(phNo == this.phNo)
			System.out.println("already exists");
		else{
		
		int otp = (int) (Math.random()*9000) + 1000;
		System.out.println("your otp is : "+otp);
		
		System.out.print("enter the otp : ");
		int userOtp = sc.nextInt();
		
		if(otp == userOtp)
			{
				this.phNo = phNo;
				System.out.println("phone number has updated successfully");
			}
		else
			{
				System.out.println("wrong otp");
			}
		
		}
	}
	
	public void average()
	{
		int sum = 0 ; 
		for(int ele : marks)
		{
			sum += ele;
		}
		
		double avg = sum / marks.length;
		System.out.println("total marks is : "+sum);
		System.out.println("average  is : "+avg);
	}
}

class StudentTask 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int option;
		Student s1 = null;
		do{
			System.out.println("1.Create Account \n2.Display Avg \n3.Change PhNo \n4.Display details \n0.Exit");
			System.out.print("enter your option : ");
			option = sc.nextInt();
			
			switch(option)
			{
				case 1 : System.out.print("enter your name : ");
				         String name = sc.next();
						 System.out.println("enter your id : ");
						 int id = sc.nextInt();
						 System.out.print("enter your phone number : ");
						 long phNo = sc.nextLong();
						 int marks[] = new int[5];
						 System.out.println("enter your marks : ");
						 for(int i=0 ; i<marks.length; i++)
				         {
					          marks[i] = sc.nextInt();
				         }
						 s1 = new Student(name,id,marks,phNo);
						 break;
						 
				case 2 : s1.average();
				          break;
						  
				case 3 : System.out.print("enter your new phone number : ");
				         long ph = sc.nextLong();
						 s1.setPhNo(ph);
						 System.out.println("your phone number is : "+s1.getPhNo());
						 break;
				
				case 4 : System.out.println(s1.getSname());
				         System.out.println(s1.getSid());
						 break;
				
				case 0 : System.out.println("thank you ");
				         break;
			}
			
		}while(option != 0);
	}
}
