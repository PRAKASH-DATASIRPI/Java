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
class Child1 extends father{
    public void come(){
        System.out.println("hiiiiii");
    }

}




public class heirachical {
    public static void main(String[] args) {
        Child1 obj = new Child1();
        Child obj1 = new Child();
        obj.come();
        obj1.get();
        obj.display();

    }
    
}
