class Father {
    public void shows(){
        System.out.println("Hiii");
    }
}

class Child extends Father {
    public void shows(){
        System.out.println("hello");
    }
    public void show () {
        System.out.println("hi");
    }
}

public class overinherit {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.shows();
        obj.show();
        
        
    }
}