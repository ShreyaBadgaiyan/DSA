package Recursion;

import java.util.Scanner;

public class factorialFunctional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

       System.out.println(summingFunctional(n)); 
    }

    public static int summingFunctional(int n){
        if(n==0){
            return 1;
        }
        return n*summingFunctional(n-1);
    }

}
