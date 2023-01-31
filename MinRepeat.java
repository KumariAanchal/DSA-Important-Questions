public class MinRepeat {
    static int minRepeats(String A, String B) {
        // code here
        String s = A;
        int count=1;
        while(A.length() < B.length()) {
            A+=s;
            count++;
        }
        if(A.contains(B))
            return count;
        A+=s;
        count++;
        if(A.contains(B))
            return count;
        return -1;
    }
}
