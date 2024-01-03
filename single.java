class father {
    public void display (){
        System.out.println("HI");
    }
}
class Child extends father{
    public void get(){
        System.err.println("hello");

    }
}



public class single {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        obj.get();
    }
    
}
