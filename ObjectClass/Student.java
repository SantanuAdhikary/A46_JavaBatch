class Student{

    String sname ; 
    int sid ;

    Student(String sname,int sid)
    {
        this.sname = sname;
        this.sid = sid;
    }
 
    @Override 
    public String toString()
    {
        return "sname is : "+sname+ " student id is : "+sid;
    }
  
    public static void main(String[] args) {
        
        Student s1 = new Student("miller", 110);
        Student s2 = new Student("scott", 60);
        System.out.println(s1);
        System.out.println(s2);

    

        // s1.stuDetails();
        // s2.stuDetails();
    }
}