import java.util.*;
public class tremapnav {
    public static void main(String[] args) {
        TreeMap<Integer,String> emp = new TreeMap<>();
        emp.put(38,"prakash");
        emp.put(59,"Suri");
        emp.put(31,"azar");

        Integer result=emp.firstKey();
        System.out.println(result);
        Integer result1=emp.lastKey();
         System.out.println(result1);


        System.out.println(emp.firstEntry());
        System.out.println(emp.lastEntry());
        System.out.println(emp.ceilingKey(38));
        System.out.println(emp.ceilingEntry(31));
        System.out.println(emp.floorKey(31));

    }

    
}
