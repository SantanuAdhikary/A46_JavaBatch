class Wbt1 
{
	public static void main(String[] args) 
	{
		Employee e=new Employee(1,"Dinga",5000);
		Department dept=new Department("IT Dept",e);
		dept.detailsOfDepartment();
	}
}
/*
Department Name is :IT Dept
Employee ID:1
Employee Name:Dinga
Employee Salary:5000.0
***********************
*/