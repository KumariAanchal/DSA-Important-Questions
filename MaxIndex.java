public class MaxIndex{
    static int maxIndexDiff(int A[], int N) { 
        int max=0;
        for(int i=0;i<N;i++){
            for(int j=N-1;j>=0;j--){
                if(A[i]<=A[j] && j>=i){
                    max=Math.max(max,j-i);
                    break;
                }
            }
        }
       return max;
    }
    public static void main(String args[]){
        int arr[]={34, 8, 10, 3, 2, 80, 30, 33, 1};
        int N=arr.length;
        System.out.println(maxIndexDiff(arr, N));
    }
}