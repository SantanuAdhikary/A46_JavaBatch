public class Marker {
    
    String brand;
    double price ;
    String color ;

    Marker(String brand , double price,String color)
    {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String toString()
    {
        return "brand name is : "+brand+" price is : "+price + " color is : "+color;
    }

    @Override
    public boolean equals(Object obj)
    {

        Marker ob = (Marker) obj;  //! downcasting
    
        return this.brand.equals(ob.brand) && 
               this.color.equals( ob.color) && 
               this.price==ob.price;
    }

    public static void main(String[] args) {
        
        Marker m1 = new Marker("camlin", 30,"blue");
        Marker m2 = new Marker("apsara", 30,"blue");
        Marker m3 = new Marker("apsara", 30,"black");
        Marker m4 = new Marker("camlin", 30,"blue");
        
       
        // System.out.println(m1 == m2);
        // System.out.println(m1 == m4);

        // System.out.println(m1.equals(m2));
        // System.out.println(m1.equals(m4));


        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(m4));
    }
}
