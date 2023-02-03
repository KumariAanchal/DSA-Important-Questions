public class Tailrecursion {
    public static void main(String args[]){
        int n=5;
        System.out.println(factTR(n, 1));
        System.out.println(factnontail(n));
    }
    public static int factnontail(int N){ 
    if (N == 0) 
        return 1; 
    return N*factnontail(N-1); 
    } 

    public static int factTR(int N, int a){ 
    if (N == 0)  
        return a; 
    return factTR(N-1, N*a); 
    } 
}
