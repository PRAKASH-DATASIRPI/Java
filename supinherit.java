class Father {
    public void shows(){
        System.out.println("Hiii");
    }
}

class Child extends Father {
    public void shows(){
        super.shows();
        System.out.println("hello");
    }
    public void show () {
        System.out.println("hi");
    }
}



public class supinherit {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.shows();
        obj.show();
    }
    
}
