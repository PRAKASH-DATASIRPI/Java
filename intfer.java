 interface animal {
    public void sound();
    public void sounds();

}
class Animals implements animal{
    public void sound (){
        System.out.println("meow");
    }
    public void sounds(){
        System.out.println("bark");
    }
}
public class intfer {
    public static void main(String[] args) {
        Animals obj1 = new Animals();
        obj1.sound();
        obj1.sounds();

    }
}