import java.util.*;
public class MeanMedian {
    public static int median(int A[],int N)
    {
      
       Arrays.sort(A);
       if(N%2==0){
            return((A[N/2]+A[(N/2)-1])/2);
       }
       else if(N%2!=0){
           return A[N/2];
       }
       else{
           return -1;
       }
    }
    public static int mean(int A[],int N)
    {
       int sum = Arrays.stream(A).sum();
       int mean=sum/N;
       return mean;//Your code here
    }
    public static void main(String args[]){
        int arr[]={2,4,8,3};
        int n=arr.length;
        System.out.println(mean(arr, n));
        System.out.println(median(arr, n));
    }

}
