public class Person {
    
    String name;
    int id;

    Person(String name,int id)
    {
        this.name = name ; 
        this.id = id ;
    }

    // @Override
  
      public boolean equals(Person p)
    {
          return this.name == p.name && this.id == p.id;
    }

    public static void main(String[] args) {
        
        Person p1 = new Person("miller", 101);
        Person p2 = p1;

        Person p3 = new Person("scott", 102);
        Person p4 = new Person("scott", 102);

        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
        System.out.println(p4 == p3);


        System.out.println(p4.equals(p3));
    }
}
