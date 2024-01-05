import java.util.*;

import java.util.stream.Collectors;
public class usingstream {
    public static void main(String[] args) {
        List<Integer>number=Arrays.asList(10,20,23,40);
        List<Integer>evennumb=new ArrayList<>();
        // filter

        number.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
        evennumb=number.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evennumb);
        List<String>str=Arrays.asList("bala","mala","kala");
         List<String>str1=new ArrayList<>();

        //  mapping
         str1=str.stream().map(word ->word.toUpperCase()).collect(Collectors.toList());
         System.out.println(str1);

        List<Integer> str2= number.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(str2);



        
        


    }
    
}
