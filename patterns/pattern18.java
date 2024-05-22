package patterns;

import java.util.Scanner;

public class pattern18{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            char count=69;
            for(int j=1;j<=i;j++){

               
                System.out.print(count);
                
            }
            
            System.out.println();
        }

        

    }
}