class Department 
{
	String dept_name;
	Employee e;
	
	Department(String dept_name,Employee e){
		//L.I
		this.dept_name=dept_name;
		this.e=e;
	}
	
	Department(String dept_name){
		//L.I
		this.dept_name=dept_name;
		
	}
	
	public void detailsOfDepartment(){
		System.out.println("Department Name is :"+dept_name);
		e.detailsOfEmployee();
	}
}
