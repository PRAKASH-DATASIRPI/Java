import java.util.*;

class linkhasmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println(numbers);
        System.out.println(numbers.entrySet());
        System.out.println( numbers.keySet());
        System.out.println(numbers.values());
    }
}
