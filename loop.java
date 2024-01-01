public class loop {
    public static void main(String[] args) {
        int num=10;
        for(int i=0;i<num;i++){
            System.out.println(i);
        }
        // inner for
        int n=5;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //  while
        int no=5;
        while (no<10){
            System.out.println(no);
            no ++;

        }
        // //break/ continue
        int rolno=19;
        for(int i=0;i<rolno;i++){
            if(i==15){
                break;
            }
            System.out.println(i);
        }
        int roll=19;
        for(int i=0;i<roll;i++){
            if(i==15){
                continue;
            }
            System.out.println(i);
        }






        


        

        
    }
}
