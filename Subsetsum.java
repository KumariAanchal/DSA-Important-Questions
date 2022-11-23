public class Subsetsum {
    public static void main(String[] args){
        int n = 3, arr[]= {10, 20, 15}, sum = 25;
		System.out.println(subsets(arr, n, sum));
    }
    public static int subsets(int arr[], int n, int sum){
        if(n==0)
            return sum==0?1:0;
        return subsets(arr, n-1 , sum)+ subsets(arr, n-1 , sum-arr[n-1]);
    }
}
