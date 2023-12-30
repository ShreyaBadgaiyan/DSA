package Recursion;

public class countLoop {
    static int count=0;
    public static void count(){
        if(count==4){
            return;
        }
        System.out.println(count);
        count++;
        count();

    }

    public static void main(String[] args) {
        count();
    }
    
}
