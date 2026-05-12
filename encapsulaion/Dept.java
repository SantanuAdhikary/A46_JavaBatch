class Dept 
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp("dhoni",7,4000);
		
		//System.out.println(e1.ename);
		//e1.ename = "jaddu";
		//System.out.println(e1.ename);
		
		
		
	   System.out.println(	e1.getEname()  );
	   System.out.println( e1.getEid() );
	   System.out.println( e1.getSal() );
	   
	     e1.setEname("jaddu");
		 e1.setEid(8);
		 e1.setSal(10000);
		 System.out.println(	e1.getEname()  );
		 System.out.println( e1.getEid() );
		  System.out.println( e1.getSal() );
	}
}
