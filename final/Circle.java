


import java.util.Scanner;
public class Circle {

      static Scanner sc = new Scanner(System.in);

      public static void area(double PI,int r )
      {
             double ans = PI * r * r ; 
             System.out.println("area of circle is "+ans +" meter square");
      }

      public static void perimeter(double PI , int r)
      {
             double ans = 2 * PI * r ;
             System.out.println("perimeter is : "+ans + " meter");
      }
 
      public static void main(String[] args) {
        
             final double PI =3.14;
             System.out.print("enter the r value : ");
             int r = sc.nextInt();
             area(PI,r);
             perimeter(PI, r);
      }    
}
