import java.util.*;

public class vect {
    public static void main(String[] args) {
        Vector<Integer> no = new Vector<>();
        no.add(3);
        no.add(5);
        no.add(7);
        System.out.println(no);

        Vector<Integer> str = new Vector<>();
        str.add(4);
        System.out.println(str);
        str.addAll(no);
        System.out.println(str);

        Iterator<Integer> iterator = str.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Integer[] obj = new Integer[str.size()]; // Specify the array type and size
        obj = str.toArray(obj); // Pass the array to the toArray method


        for (Integer num : obj) {
            System.out.println(num);
        }
    }
}
