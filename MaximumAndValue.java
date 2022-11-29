public class MaximumAndValue {
    public static void main(String[] args){
        int N = 4;
        int arr1[] = {4, 8, 12, 16};
        System.out.println(maxAND(arr1, N));
    }
         public static int maxAND (int arr[], int N) {
             int res = 0, count;
             for (int bit = 31; bit >= 0; bit--) {
                 count = checkBit(res | (1 << bit), arr, N);
                 if (count >= 2)
                     res |= (1 << bit);
             }
             return res;   
         }
         public static int checkBit(int pattern, int arr[], int N)
         {
             int count = 0;
             for (int i = 0; i < N; i++)
                 if ((pattern & arr[i]) == pattern)
                     count++;
             return count;
         }
      
}