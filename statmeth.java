public class statmeth {
    static void print(){
        System.out.println("it automatically");
    }
    
    
    public static int add (int a,int b){
        return a+b;
    }
    

    public static void main(String[] args) {
        statmeth.print();
       int res =statmeth.add(1,2);
       System.out.println(res);
        
    }
}