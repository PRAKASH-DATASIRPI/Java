import java .util.*;
public class comp {
    public static void main(String[] args) {
        Comparator<Integer> number= new Comparator<Integer>() {
            @Override
            public int compare(Integer a1, Integer a2) {
                if(a1%10>a2%10){
                    return 1;
                    
                }
                else{
                return 0;
                }
            }
        };
        ArrayList<Integer>num1=new ArrayList<>();
        num1.add(12);
        num1.add(21);
        num1.add(132);
        num1.add(7);
        Collections.sort(num1,number);
        System.out.println(num1);
    }
}