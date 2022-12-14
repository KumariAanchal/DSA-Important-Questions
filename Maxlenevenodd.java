public class Maxlenevenodd {
    public static void main(String[] args){
        int arr[]={10,12,14,7,8};
        System.out.println(maxEvenOdd(arr));
    }
    public static int maxEvenOdd(int arr[]){
        int n=arr.length;
        int curr=1;
        int res=1;
        for(int i=1; i<n; i++){
            if ((arr[i]%2==0 && arr[i-1]%2==0) || (arr[i]%2!=0 && arr[i-1]==0)){
            curr++;
            res=Math.max(res,curr);
            }
            else
            curr=1;
        }
        return res;
    }
}
