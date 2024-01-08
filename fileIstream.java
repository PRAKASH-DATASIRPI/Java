import java.io.FileInputStream;
import java.io.InputStream;

public class fileIstream {
    public static void main(String[] args) {
        byte[] array = new byte[100];
        try {
            InputStream input = new FileInputStream("filename.txt");
            System.out.println(input.available());


            input.read(array);
            System.out.println("data s");

            String data = new String(array);
            System.out.println(data);

            input.close();
            
        } catch (Exception e) {
            System.out.println("ssss");
        
        }
    }
    
}
