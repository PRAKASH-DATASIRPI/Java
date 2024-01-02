public class noarg {
    int i;

    private noarg(){
        i=5;
        System.out.println("cons called");
    }
    public static void main(String[] args) {
        noarg objec = new noarg();
        System.out.println(objec.i);
    }
}   