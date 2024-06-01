package Recursion;

import java.util.Scanner;

public class rec4 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Print(n,n);
    }

    public static void Print(int count,int a){

        if(count<1){
            return;
        }
        Print(count-1,a);
        System.out.println(count);
       
        
        

    }
}
