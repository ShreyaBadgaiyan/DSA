package Recursion.Sorting;
import java.util.Scanner;

public class selection_Sort {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter the number of Array elements : ");
            int n=sc.nextInt();
            int[] arr=new int[n];
            System.out.println("Please enter array elements");
            for (int i = 0; i < n; i++) {

                 arr[i]=sc.nextInt();
                
            }
            selection_sort(arr,n);
            System.out.println("The sorted array is as follows:");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]+" ");
                
            }
        }

    


    public static void selection_sort(int arr[],int n){

        for (int i = 0; i <=n-2; i++) {
            int min=i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            
        }
        return;
    }
}
   
