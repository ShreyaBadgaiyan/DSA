package Recursion;

public class baseCondn {

   static int count=0;
    public static void main(String[] args) {
        f();
        System.out.println("Recursion done successfully without stack overflow.");
    }

    

    public static void f(){
        
        if (count==7){
            return;
        }
        System.out.println(count);
        count++;
        f();

    }
}
