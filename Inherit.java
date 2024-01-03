class Father {
    String name;
    public void tell(){
        System.out.println("hello my child");
    }
}

class children extends Father{
    public void show (){
        System.out.println("hii paa");
    }
}

public class Inherit{
    public static void main(String[] args) {
        children objects = new children();
        String res=objects.name="prakash";
        System.out.println(res);
        objects.tell();
        objects.show();
        
    }
 }

