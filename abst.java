abstract class animal {
    public abstract void sound();

    public void name(){
        System.out.println("hekko");
    }
}
class Animal extends animal{
    public void sound(){
        System.out.println("djkfb");
    }

}




public class abst {
    public static void main(String[] args) {
        Animal obj1= new Animal();
        obj1.sound();
        obj1.name();
    }
    
}