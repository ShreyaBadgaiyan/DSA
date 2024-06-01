package Recursion;

import java.util.Scanner;

public class rec1 {

    static int count=0;
    public static void main(String[] args) {
        //Print name 5 times
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int n=sc.nextInt();

        printName(name,n);

    }

    public static void printName(String name,int n){
        if (count==n){
            return;
        }
        System.out.println(name);
        count++;
        printName(name,n);
    }
}
