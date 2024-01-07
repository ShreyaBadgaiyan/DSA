package Recursion;



//Print name 5 times

public class problem1 {
    

    public static void main(String[] args) {
    
            print("Shreya");
        }
    
   static int count=0;
    public static void print(String name){
        if (count==5){
            return;
        }
        System.out.println(name);
        count++;
        print("Shreya");
    }
}