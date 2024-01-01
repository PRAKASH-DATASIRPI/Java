import java.util.*;
public class condition {
    public static void main(String[] args) {
        int age=21;
        if(age>18){
            System.out.println(age +" "+ "he is elgible");
        }
        else if(age==18){
            System.out.println(age+"he is also elgible");
        }
        else {
            System.out.println("he is not elgible");
        }
        // Switch case

        int day =12;
        switch (day) {
            case 11:
            System.out.println("NO HOLIDAY");
            break;
             case 12 :
             System.out.println("NO HOLIDAY");
            break;
             case 13:
             System.out.println("NO HOLIDAY");
             break;
             case 14:
             System.out.println( "HOLIDAY");
             break;

             default:
             System.out.println("NO festival");
                break;
        }

        
    }
    
}
