public class IsPrime {
    public static void main(String[] args){
        System.out.println(isPrime(4));
        System.out.println(effPrime(17));
        System.out.println(bestsolprime(1229));
    }
    public static boolean isPrime(int n) {
        if(n==1){
            return false;
        }
        for (int i=2; i<n; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean effPrime(int n){
        if (n==1) return false;
        for (int i=2; i*i<=n; i++){
            if (n%i==0) return false;
        }
        return true;
    }
    public static boolean bestsolprime(int n){
        if(n==1) return false;
        if (n==2 || n==3) return true;
        if (n%2==0 || n%3==0) return false;
        for (int i=5; i*i<=n; i=i+6){
            if (n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
}
