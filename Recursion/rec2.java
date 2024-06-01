package Recursion;

import java.util.Scanner;

public class rec2 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Print(1,n);
    }

    public static void Print(int count,int a){

        if(count==a+1){
            return;
        }
        System.out.println(count);
        count++;
        Print(count,a);
        

    }
}
