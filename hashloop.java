import java.util.*;
public class hashloop {
    public static void main(String[] args) {
        HashSet<Integer> numb = new HashSet<>();
        numb.add(1);
        numb.add(2);
        numb.add(13);
        for (int i=1;i<=10;i++) {
            if(numb.contains(i)){
                System.out.println("it is");

            }
            else {
                System.out.println("may not");
            }
            
        }

    }
    
}
