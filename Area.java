class Ans{
    private int a;
    private int b;
    // setter
    public Ans(int a,int b){
       this. a=a;
        this.b=b;
    }
// getter
    public int getarea(){
        int area = a*b;
        return area;



    }
}
public class Area {
    public static void main(String[] args) {
        Ans obj = new Ans(1,2);
        int result =obj. getarea();
        System.out.println(result);
        
    }
}