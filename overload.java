public class overload {
     static int c;
     static String c1;
    static void sum(int a,int b ){
        c=a+b;
        System.out.println(c);
    }
    static void sum(String nam1,String nam2){
        c1=nam1+nam2;
        System.out.println(c);
    }
    public static void main(String[] args) {
        sum(1,2);
        sum("prakash","murugan");
        
    }
    
}
