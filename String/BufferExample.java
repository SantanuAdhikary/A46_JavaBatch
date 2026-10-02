public class BufferExample {
    
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("good morning");

        
        sb.delete(0, 3);

        System.out.println(sb);
        sb.reverse();
        }
}
