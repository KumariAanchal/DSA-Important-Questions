//Given the total number of persons n and a number k which indicates that k-1 persons are skipped and kth person is killed in circle in a fixed direction.
public class Josephus {
    public static void main(String[] args){
        System.out.println(jos(5, 3));
    }
    public static int jos(int n, int k){
        if(n==1)
        return 0;
        else
        return(jos(n-1, k)+k)%n;
    }
}
