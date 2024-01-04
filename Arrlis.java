import java.util.*;
public class Arrlis {
    public static void main(String[] args) {
        ArrayList<String> language = new ArrayList<>();
        language.add("java");
        language .add("g0lang");
        language .add ("python");
        System.out.println(language);

        String str1=language.get(1);
        String str2=language.get(2);
        System.out.println("get" +" ,"+str1+" ," +str2);

        String str0=language.set(0,"js");
        String str3=language.set(2,"rj");
        System.out.println(str0);
        System.out.println(str3);
        System.err.println(language);

        String str4 = language.remove(1);
        System.out.println(language);
        

    }
    
}
