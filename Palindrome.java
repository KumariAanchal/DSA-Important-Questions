import java.io.*;
public class palindrome {
    public static void main(String[] args){
        System.out.println(isPal(121));
    }
    public static boolean isPal(int n){
        int rev=0;
        int temp=n;
        while (temp!=0){
            int ld=temp%10;
            rev=rev*10 + ld;
            temp= temp/10;
        }
        return(rev==n);
    }
}
