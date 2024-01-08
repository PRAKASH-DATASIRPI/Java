import java.io.ByteArrayInputStream;

public class bytearryIstream {
    public static void main(String[] args) {
        byte[]array1={1,2,1,3};
        try {
            ByteArrayInputStream input = new ByteArrayInputStream(array1);
            input.skip(-1);
            System.out.println("its skipped");
            System.out.println("its read");
            for(int i=0;i<array1.length;i++){
                int data = input.read();
                System.out.println(data);
            }
            input.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
