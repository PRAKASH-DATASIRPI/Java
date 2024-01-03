public class finl {
    final int x = 10;
    public static void main(String[] args) {
        finl obj =new finl();
        // errror throw
        obj.x=25;
        System.out.println(obj.x);
    }
}
