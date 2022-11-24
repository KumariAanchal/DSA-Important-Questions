// //Take the set of integers
// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,……
// First, delete every second number, we get following reduced set.
// 1, 3, 5, 7, 9, 11, 13, 15, 17, 19,…………
// Now, delete every third number, we get
// 1, 3, 7, 9, 13, 15, 19,….….
// Continue this process indefinitely……
// Any number that does NOT get deleted due to above process is called “lucky”.

public class IsLuckyNum {
    public static void main(String[] args){
        System.out.println(isLucky(74));
    }
    public static int counter=2;
    
    public static boolean isLucky(int n){
        if(counter>n)
        return true;
        if(n%counter==0)
        return false;
        int nextpos=n-(n/counter);
        counter++;
        return isLucky(nextpos);
    }
}
