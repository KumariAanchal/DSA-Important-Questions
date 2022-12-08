import java.util.Arrays;

import java.io.*;
import java.util.*;

public class Sieve {
    public static void main(String[] args){
        sieveprime(16);
    }
    public static void sieveprime(int n){
        boolean isPrime[]=new boolean[n+1];
        Arrays.fill(isPrime, true);
        for (int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=n;j=j+i){
                    isPrime[j]=false;
                }
            }
        }
        for (int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.println(i);
            }
        }

    }
}
