public class Missingno {
    public static int MissingNumber(int array[], int n) {
        int sum = (n * (n+1)) / 2;
        for(int i =0; i<n-1 ; i++)
        {
            sum -= array[i];
        }  
        return sum;// Your Code Here
    }
    public static void main(String args[]){
        int arr[]={1,2,3,5};
        int n=5;
        System.out.println(MissingNumber(arr, n));
    }
}
