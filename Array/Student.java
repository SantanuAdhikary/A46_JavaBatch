class Student 
{
	int sid;
	String sname;
	String type;
	
	Student(int sid,String sname,String type){
		this.sid=sid;
		this.sname=sname;
		this.type=type;
	}
	
	public void detailsOfStudent(){
		System.out.println("Student ID:"+sid);
		System.out.println("Student Name:"+sname);
		System.out.println("Type:"+type);
		System.out.println("*************************");
	}
}
