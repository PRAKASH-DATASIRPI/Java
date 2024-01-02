public class statcvar {
   static  int c;

    void add(int a,int b){
       c =1;
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        statcvar obj =new statcvar();
        obj.add(2,3);

    }



}