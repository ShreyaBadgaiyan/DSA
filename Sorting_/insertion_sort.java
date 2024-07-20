package Sorting_;
import java.util.Scanner;

public class insertion_sort {

    public static void insertion_sort(int n, int[] arr){
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        return;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array elements:");
        int n=sc.nextInt();
        System.out.println("Enter the elements to be present in array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Your array is as follows");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

        insertion_sort(n, arr);

        System.out.println("Your sorted array is as follows : ");

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
    
}
