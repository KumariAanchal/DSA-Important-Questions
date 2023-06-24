//Given an array Arr of N positive integers and an integer K, find K largest elements from the array.  
//The output elements should be printed in decreasing order.
class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        int res[]=new int[k];
        Arrays.sort(arr);
        int j=0;
        for(int i=n-1; i>(n-k-1); i--){
            res[j]=arr[i];
            j++;
        }
        return res;
    }
}
