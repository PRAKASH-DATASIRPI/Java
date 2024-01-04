import java.util.*;
public class Add {
    public static void main(String[] args) {
        HashSet<Integer>num= new HashSet<>();
        num.add(12);
        num.add(123);
        num.add(1);
        System.out.println(num);

        Iterator<Integer> i = num.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}