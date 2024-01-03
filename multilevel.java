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
class Child1 extends Child{
    public void come(){
        System.out.println("hiiiiii");
    }

}


 
public class multilevel {
    public static void main(String[] args) {
        Child1 objs =new Child1();
        objs.come();
        objs.get();
        objs.display();
    }
    
}
