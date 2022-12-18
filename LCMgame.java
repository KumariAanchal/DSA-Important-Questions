// Given an integer N. Find maximum LCM (Least Common Multiple) that can be obtained from four numbers less than or equal to N.
// Note: Duplicate numbers can be used.

public class LCMgame {
    public static void main(String[] args){
        System.out.println(maxGcd(4));
    }
    
    public static long maxGcd(int N) {
        return Math.max(solve(N),solve(N-1));// code here
    }
    public static long gcd(long a,long b) {
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public static long solve(long n) {
        long a1 = n;
        int include=0;
        for(long i=n-1;i>=1;i--) {
            long g = gcd(a1,i);
            if(g==1) {
                a1*=i;
                include++;
            }
            if(include==3) return a1;
        }
        return a1;
    }
}
