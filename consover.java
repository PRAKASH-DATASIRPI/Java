public class consover {
    String Name;

    consover(){
        Name="prakash";
    

    }

    consover(String name){
        Name=name;
        System.out.println(Name);

    }
    public static void main(String[] args) {
        consover obj = new consover();
        String res=obj.Name;
        System.out.println(res);
        consover obj1 = new consover("murugan");

    

    }
    
}
