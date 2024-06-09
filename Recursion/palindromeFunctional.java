package Recursion;

public class palindromeFunctional {
    //To check if a string is palindrome or not.
//String on reversed remains same, MADAM,MALAYALAM,'12321',pop.

public static void main(String[] args) {
    String str=new String("MADAM");
    checkPalindrome(0,str.length(),str);
    
}

public static void checkPalindrome(int i,int n,String str){
    if(str.charAt(i)==str.charAt(n-i-1)){

        checkPalindrome(i+1, n-i-1, str);
    }
}
}
