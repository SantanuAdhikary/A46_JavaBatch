public class Marry {
    
    public static void main(String[] args) {
        
        System.out.println("start");
        int age = 10 ; 

        if(age >=21)
            System.out.println("you can marry");
        else
           throw new ArrayIndexOutOfBoundsException("you can't marry");

        System.out.println("end");
    }
}
