public class Maxsumsubarr {
    public static void main(String[] arges){
        int arr[]={2,3,-8,7,-1,2,3};
        System.out.println(maxsum(arr));
    }
    public static int maxsum(int arr[]){
        int n= arr.length;
        int res=arr[0];
        int max_end=arr[0];
        for(int i=1; i<n; i++){
            max_end=Math.max(max_end+arr[i],arr[i]);
            res=Math.max(res, max_end);
        }
        return res;
    }
}