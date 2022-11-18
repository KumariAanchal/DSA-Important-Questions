public class Checkbit {
    public static void main(String[] args){
        iskthset(5, 3);
    }
    public static void iskthset(int n, int k){
        int x= (1<<(k-1));
        if((n&x)!=0)
        System.out.println("yes");
        else
        System.out.println("no");
    }
}
