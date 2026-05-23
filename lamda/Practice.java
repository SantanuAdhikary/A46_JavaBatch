@FunctionalInterface
interface Student
{
    void study();

}


public class Practice {
    public static void main(String[] args) {
        

        // class Boy implements Student{

        //     @Override
        //     public void study()
        //     {
        //         System.out.println("student is studying");
        //     }
        // }

        // Boy b1 = new Boy();
        // b1.study();





        // Student stu1 = new Student(){

        //     @Override
        //     public void study()
        //     {
        //         System.out.println("student is studying");
        //     }
        // };

        // stu1.study();


       Student stu = ()->{
         System.out.println("hi");
       };

       
       stu.study();
            
            
    }
}
