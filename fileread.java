import java.io.File;
import java .util.*;
public class fileread {
    public static void main(String[] args) {
        try {
            File f = new File("Example.odt");
            Scanner reader = new Scanner(f);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
                
            }
            reader.close();
        
            
        } catch (Exception e) {
            System.out.println("E");
        }

    }
}