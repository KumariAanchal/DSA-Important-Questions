public class Gcd {
    public static void main(String[] args) {
        System.out.println(gcd(12, 15));
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b, a%b);
        }

    }
}
