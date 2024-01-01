public class constparm {
    // int i;
    // public constparm(int j){
    //     i=j;

    // }
    // public static void main(String[] args) {
    //     constparm objet = new constparm(10);
    //     System.out.println(objet.i);

        
    // }
    // many params
     String area;
     int code;
     public constparm (String myarea , int mycode){
        area=myarea;
        code=mycode;
     }
     public static void main(String[] args) {
        constparm obj = new constparm("nellai",627007);
        System.out.println(obj.area);
        System.out.println(obj.code);

     }



}
