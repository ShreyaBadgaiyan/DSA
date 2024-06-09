package Recursion;

import java.util.Scanner;

public class reverseFunctional{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5};

        revArr(0,arr.length,arr);
        
    }

    public static void revArr(int l,int r,int[] arr){

        if(l==r){
            return;
        }
        swap(arr, l, r);
        revArr(l+1, r-1, arr);
    }
}