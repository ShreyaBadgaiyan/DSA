package Sorting_;
import java.util.Scanner;

public class selection_sort {


    public static void selection_sort_(int n,int arr[]){
         for(int i=0;i<=n-2;i++){
            int min=i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }

            //Swapping

            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

        return;

    }

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number of arraye elements : ");

        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Please enter the array elements");
        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();

        }

        System.out.println("Following is list of your array elements : ");

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);

        }
        
        selection_sort_(n,arr);

        //Sorted array

        System.out.println("Following is the sorted array : ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);

        }


    }
    
}
