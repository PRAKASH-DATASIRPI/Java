import java .util.*;
public class iterateloop {
    public static void main(String[] args) {
        HashMap<Integer,String>num = new HashMap<>();
        num.put(1,"prakash");
        num.put(2,"thiruvarsu");
        num.put(3,"siva");
        num.put(4,"raj");

        System.out.println(num);

        for (Integer i : num.keySet()) {
            System.out.println(i);
            System.out.println(num.get(i));




        
        }

    }
    
}
