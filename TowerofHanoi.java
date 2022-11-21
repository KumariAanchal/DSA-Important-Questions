public class TowerofHanoi {
    public static void main( String[] args){
        Toh(3, 'A', 'B', 'C');
    }
    public static void Toh(int n, char A, char B, char C){
        if(n==1){
            System.out.println("Move 1 from "+A+" to "+C);
            return;
        }
        Toh(n-1, A, C, B);
        System.out.println("Move "+n+" from "+A+" to "+C);
        Toh(n-1,B,A,C);
    }
}
