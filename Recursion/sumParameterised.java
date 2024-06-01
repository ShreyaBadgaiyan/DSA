package Recursion;

import java.util.Scanner;

public class sumParameterised {
    // Printing sum of n natural numbers using parameterised recursion.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        summing(n,0);

    }

    public static void summing(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }

        summing(i-1, sum+i);
    }
}
