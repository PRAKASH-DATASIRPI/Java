import java.util.*;
public class hasrem {
    public static void main(String[] args) {
        HashSet<Integer> numb = new HashSet<>();
        numb.add(1);
        numb.add(2);
        numb.add(13);

        System.out.println(numb);
        boolean value = numb.remove(2);
        System.out.println(value);
        // boolean value1 = numb.removeAll(numb);
        // System.out.println(value1);
        boolean value3=numb.contains(13);
        System.out.println(value3);
        
    }
    
    
}
