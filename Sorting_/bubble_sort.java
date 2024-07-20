package Sorting_;

import java.util.Scanner;

public class bubble_sort {

    public static void bubble_sort(int n, int[] arr){
        for(int i=n-1;i>=1;i--){
            int didSwap=0;
            for(int j=0;j<=i-1;j++){
                //Swapping
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap=1;
                }
                
            }
            if(didSwap==0){
                System.out.println("Already ordered");
                break;
            }
            System.out.println("runn");
            
        }
        return;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The given is your array : ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

        bubble_sort(n, arr);

        System.out.println("The sorted array by bubble sort is as follows : ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
    
}
