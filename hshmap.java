import java.util.*;

public class hshmap {
    public static void main(String[] args) {
        HashMap<Integer,String> num= new HashMap<>();
        num.put(1,"prakash");  
        num.put(2,"subair");
        num.put(3,"adi");  
        System.out.println(num);
          
        HashMap<Integer,String> num1= new HashMap<>();
        num1.put(1,"abi");
        num1.put(4,"solo");
        System.out.println(num1);

        num1.putAll(num);
        System.out.println(num1);

        num.putIfAbsent(4,"siva");

        num.putIfAbsent(3,"kowsi");
        System.out.println(num);

        String value = num.get(1);
        System.out.println(value);

        System.out.println(num.keySet());
        System.out.println(num.values());
        System.out.println(num.entrySet());
        



    


    }
}