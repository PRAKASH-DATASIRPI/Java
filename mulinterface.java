interface animal {
    public void sound();
    public void sounds();

}
interface birds {
    public void sound1();
    public void sounds1();

}
class living implements animal,birds{
    public void sound(){
        System.out.println("roaring");
    }
    public void sounds(){
        System.out.println("barking");
    }
    public void sound1 (){
        System.out.println("chrps");
    }
    public void sounds1 (){
        System.out.println("chrping");
    }
}




public class mulinterface {
    public static void main(String[] args) {
        living obj = new living();
        obj.sound();
        obj.sounds();
        obj.sound1();
        obj.sounds1();
    }
    
}
