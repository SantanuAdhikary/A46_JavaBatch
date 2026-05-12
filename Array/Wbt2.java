import java.util.Scanner;
class Wbt2 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Qspider qsp=new Qspider("Girish Sir","Chennai");
		
		boolean flag=true;
		do
		{
			System.out.println("1.Add Student\n2.Remove Student\n3.Search Student\n4.Exit");
			System.out.print("\t\t\tSelect Here:");
			int input=sc.nextInt();
			switch(input){
				case 1->{
					System.out.print("\t\t\tEnter student ID:");
					int sid=sc.nextInt();
					System.out.print("\t\t\tEnter student name:");
					String sname=sc.next();
					System.out.print("Development of Testing Enter :");
					String type=sc.next();
					Student s=new Student(sid,sname,type);
					qsp.addStudent(s);
				}
				
				case 2->{
					System.out.print("\t\t\tEnter Student ID:");
					int sid=sc.nextInt();
					qsp.removeStudent(sid);
				}
				
				case 3->{
					System.out.print("\t\t\tEnter your name:");
					String name=sc.next();
					System.out.print("\t\t\tEnter Student ID:");
					int sid=sc.nextInt();
					qsp.searchStudent(name,sid);
				}
				
				case 4->{flag=false;}
			}
		}
		while (flag);
		System.out.println("\t\t\t-Thank You");
	}
}
