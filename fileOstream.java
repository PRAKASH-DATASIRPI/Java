import java.io.FileOutputStream;

public class fileOstream {
    public static void main(String[] args) {
        String word ="this is me ";
        try {
            FileOutputStream out = new FileOutputStream("Example.odt");
            byte[] databytes = word.getBytes();
            out.write(databytes);
            System.out.println("data written");
        } catch (Exception e) {
            System.out.println("eee");
        }
    }
    
}
