
public class Emp {
    
    private String ename ;
    private int eid ;

    Emp(String ename , int eid)
    {
        this.ename = ename;
        this.eid = eid;
    }

    public String getEname()
    {
        return this.ename;
    }
    public int getEid()
    {
        return this.eid;
    }

    Emp setEid(int eid)
    {
        this.eid = eid;
        return this;
    }
    Emp setEname(String ename)
    {
        this.ename = ename;
        return this;
    }

    void empDetails()
    {
       System.out.println("emp name is : "+getEname());
       System.out.println("emp id is : "+getEid());
    }

    public static void main(String[] args) {
        
        Emp e1 = new Emp("miller", 101);
        e1.empDetails();
        
        e1.setEid(200).setEname("scott").empDetails();
    }
}
