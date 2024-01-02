public class ifmethod {
    static void physic(int height){
        if(height>6){
            System.out.println("he is select");
        }
        else if (height==6){
            System.out.println("he also select");
        }
        else{
            System.out.println("just miss");
        }

    }
    
    public static void main(String[] args) {
        physic(7);
    }
    
}
