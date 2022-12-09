// This program finds the maximum difference between the elements of an array in theta(n) time.
public class Maxdiff {
    public static int maxdiff(int arr[], int n){
        int res= arr[1]-arr[0], minval=arr[0];
        for(int j=1; j<n; j++){
            res=Math.max(res, arr[j]-minval);
            minval=Math.min(minval, arr[j]);
        }
        return res;
    }
    public static void main(String args[]) 
    { 
       int arr[] = {2, 3, 10, 6, 4, 8, 1}, n = 7;
       System.out.println(maxdiff(arr,n));
    } 
}
