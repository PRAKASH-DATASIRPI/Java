public class constr {
    int i ;
    constr() {
        i=10;
        System.out.println("he called me");
    }

    public static void main (String[]args) {
        constr objects = new constr();
        System.out.println(objects.i);

    }
    
    
}
