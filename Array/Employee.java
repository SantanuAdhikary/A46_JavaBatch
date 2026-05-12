class Employee 
{
	int eid;
	String name;
	double sal;
	
	Employee(int eid,String name,double sal){
		//L.I
		this.eid=eid;
		this.name=name;
		this.sal=sal;
	}
	
	public void detailsOfEmployee(){
		System.out.println("Employee ID:"+eid);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Salary:"+sal);
		System.out.println("***********************");
	}
	
}
