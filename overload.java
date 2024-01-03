class Pattern {
    void star() {
        for(int i=0;i<5;i++){
            System.out.println("*");
        }
    }

}
class Symbol extends Pattern{
    void star (char symb) {
         for(int i=0;i<5;i++){
            System.out.println(symb);
        }
    }

 }




public class overload {
    public static void main(String[] args) {
        Pattern obj1 = new Pattern();
        Symbol obj2 = new Symbol();

        obj1.star();
        obj2.star('#');
    }

}