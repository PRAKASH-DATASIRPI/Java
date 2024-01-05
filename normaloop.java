import java.util.*;
public class normaloop {
    public static void main(String[] args) {
        ArrayList<Integer>num=new ArrayList<Integer>();
        num.add(22);
        num.add(3);
        num.add(4);
        num.add(32);
        System.out.println("fffff"+num);

        for(int i =0;i<num.size();i++){
            System.out.println(num.get(i));
        }
        Collections.sort(num);

        for (Integer i : num) {
            System.out.println(i);
            
        }
        
    }
}