import java.util.*;
public class link {
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>();
        str.add("prakash");
        str.add("suriya");
        str.add("magesh");
        System.out.println("fst:"+str);
        str.addFirst("prak");
        str.addLast("kash");
        System.out.println("add:"+str);
        str.removeFirst();
        str.removeLast();
        System.out.println("rem"+str);
        str.getFirst();
        str.getLast();
        System.out.println("get"+str);


    }
}