class Qspider 
{
	String ceo,branch;
	Student []seats=new Student[5];
	
	Qspider(String ceo,String branch){
		this.ceo=ceo;
		this.branch=branch;
	}
	
	public void addStudent(Student s){
		int index=isSeatsAvailable();
		if(index!=-1){
			seats[index]=s;
			System.out.println("\t\t\tStudent Added");
			return ;
		}
		System.out.println("\t\t\tSeats are Full");
	}
	
	public int isSeatsAvailable(){
		for(int i=0;i<seats.length;i++){
			if(seats[i]==null)
				return i;
		}
		return -1;
	}
	
	public void removeStudent(int sid){
		
		for (int i=0;i<seats.length ;i++ )
		{
			if(seats[i]==null)
				continue;
			
			if(seats[i].sid==sid){
				seats[i]=null;
				System.out.println("\t\t\tStudent Removed");
				return;
			}
		}
		System.out.println("\t\t\tStudent Not Found");
	}
	
	public boolean searchStudent(String name,int id){
		
		for(int i=0;i<seats.length;i++){
			if(seats[i]==null)
				continue;
			
			if(seats[i].sname.equals(name) && seats[i].sid==id){
				System.out.println("\t\t\tStudent Found");
				return true;
			}
		}
		System.out.println("\t\t\tStudent Not Found");
		return false;
	}

}
