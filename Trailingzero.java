import java.io.*;
public class Trailingzero {
    public static void main(String[] args){
        int a= CounttrailingZero(10);
        int b=Countzero(10);
        System.out.println(a);
        System.out.println(b);
    }
    //optimal solution
    public static int CounttrailingZero(int n){
        int res=0;
        for(int i=5; i<=n;i=i*5){
            res=res+n/i;
        }
        return res;
    }
    //normal solution
    public static int Countzero(int n){
        int fact=1;
        int resz=0;
        for(int i=2; i<=n;i++){
            fact=fact*i;
        }
        while(fact%10==0){
            resz++;
            fact=fact/10;
        }
        return resz;
    }
  
}