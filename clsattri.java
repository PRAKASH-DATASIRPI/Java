public class clsattri {
    int x=17;
    int y=12;
    String name="alan";
    public static void main(String[] args) {
        clsattri num = new clsattri ();
        int res=num.x;
        System.out.println(res);
        // modify
        num.y=11;
        int ress =num.y;
        System.out.println(ress);
        


        // multiple objects

        
        
        clsattri empnam = new clsattri();
        clsattri empnam1 = new clsattri();
        System.out.println(empnam.name);
        System.out.println(empnam1.name);
        

        



    }
    

    
}
