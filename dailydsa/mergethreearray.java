class Solution
{
    // A[], B[], C[]: input arrays
    //Function to merge three sorted lists into a single list.
    static ArrayList<Integer> merge3sorted(int A[], int B[], int C[])
    {
        // add ypur code here
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=0; i<A.length; i++){
            res.add(A[i]);
        }
        for(int i=0; i<B.length; i++){
            res.add(B[i]);
        }
        for(int i=0; i<C.length; i++){
            res.add(C[i]);
        }
        Collections.sort(res);
        return res;
        
    }
}
