package patterns;

import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
   
    for(int i=n;i>=1;i--){

        char count=65;
        for(int j=1;j<=i;j++){

            System.out.print(count);
            count++;
        }
        System.out.println();
    }
    }
}
