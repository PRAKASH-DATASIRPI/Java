class Shapes {
    public void angle (){
        System.out.println("90");
    }
}
class Circle extends Shapes {
    public void angle (){
        System.out.println("85");
    }
} 

class Rect extends Shapes {
    public void angle (){
        System.out.println("38");
    }

}





public class polym{
    public static void main(String[] args) {
        Shapes obj1 = new Shapes();
        Circle obj2 = new Circle();
        Rect obj3 = new Rect();

        obj1.angle();
        obj2.angle();
        obj3.angle();

        



    }

}