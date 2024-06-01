package Recursion;

import java.util.Scanner;

public class rec5 {

    //Reverse from N to 1 using Back Tracking
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Print(1,n);
    }

    public static void Print(int count,int a){

        if(count>a){
            return;
        }
        Print(count+1,a);

        System.out.println(count);
        
        

    }
}
