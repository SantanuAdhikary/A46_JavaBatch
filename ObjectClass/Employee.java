import java.util.Objects;

class Employee
{
     String ename ; 
     int eid ;

     Employee(String ename , int eid)
     {
        this.ename = ename ; 
        this.eid = eid;
     }

     @Override 
     public boolean equals(Object obj)
     {
        Employee e =  (Employee) obj;

        return this.ename.equals(e.ename) && this.eid == e.eid;
     }


     @Override
     public int hashCode()
     {
        return Objects.hash(ename,eid);
     }


    public static void main(String[] args)
    {
            Employee e1 = new Employee("gaja", 101);
            Employee e2 = new Employee("tabru", 102);
            Employee e3 = new Employee("gaja", 101);

            System.out.println(e1 == e2);  // false
            System.out.println(e1 == e3);  // false

            System.out.println(e1.equals(e3));

            System.out.println("hashcode for e1 : "+e1.hashCode());
            System.out.println("hashcode for e2 : "+e2.hashCode());
            System.out.println("hashcode for e3 : "+e3.hashCode());
        }
}