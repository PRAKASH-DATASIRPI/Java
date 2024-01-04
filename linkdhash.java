import java.util.*;

public class linkdhash {
    public static void main(String[] args) {
        LinkedHashSet<Integer> A= new LinkedHashSet<>();
        A.add(3);
        A.add(13);
        A.add(31);

        LinkedHashSet <Integer> A1 = new LinkedHashSet <>();
        A1.add(3);
        A1.add(13);
        boolean value = A.containsAll(A1);
        System.out.println(value);
    



    }
    
}
