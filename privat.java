// privatee access within a  class only
public class privat {
    private String name= "Thiruvarsu";
    private int age =22;
    private char init ='U';

    public static void main(String[] args) {
        privat data=new privat();
        String z=data.name;
        System.out.println(z);
        int z1=data.age;
        System.out.println(z1);
        char z2=data.init;
        System.out.println(z2);
    }

    
}
