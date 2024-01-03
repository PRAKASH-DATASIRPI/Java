class lang {
    void pro (){
        System.out.println("java");
    }
}
class langu extends lang{
    void pro(){
        System.out.println("pyth");
    }
}



public class polyvar {
    public static void main(String[] args) {
        lang l1;

         l1 = new lang();
         l1.pro();

         l1 = new langu();
         l1.pro();



    }

    
}
