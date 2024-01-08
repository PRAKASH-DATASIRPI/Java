
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class filewrite {
    public static void main(String[] args) {
        
    
    
try{
    File myObj = new File("Example.odt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }

      FileWriter myWriter = new FileWriter("filename.txt");

      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.close();

       Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();

}catch(Exception e){
    System.out.println(e);

}
  }
}
