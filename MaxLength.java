public class MaxLength {
    public static int maxLength(int arr[], int n) { 
        //code here
        int strt=0,first_negative=-1,count_negative=0;
        int ans=0;
        for(int i=0;i<n;i++) {
            if(arr[i]==0) {
                strt=i+1;
                first_negative=-1;
                count_negative=0;
                continue;
            } else if(arr[i]<0) {
                count_negative++;
                if(first_negative==-1) first_negative=i;
            }
            
            if(count_negative%2==0) {
                ans = Math.max(ans,i-strt+1);
            } else {
                ans = Math.max(ans,i-first_negative);
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[]={0, 1, -2, -3, -4};
        int n=arr.length;
        System.out.println(maxLength(arr, n));
    }
}
