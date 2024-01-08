import java.io.ByteArrayOutputStream;

public class bytearryOstream {
    public static void main(String[] args) {
        String name = "hllo every one";
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[]array = name.getBytes();
            out.write(array);
            System.out.println("written");
        //   retrive data from stream to string
            String streams = out.toString();
            System.out.println(streams);

            out.close();





        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
