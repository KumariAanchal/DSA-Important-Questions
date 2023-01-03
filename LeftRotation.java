//This program rotates an array by d times. Time Complexity theta(n) and Auxiliary space theta(1).
public class LeftRotation {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        leftror(arr,2);
        for (int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
    }
    public static void leftror(int arr[], int d){
        int n=arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int arr[], int low, int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
}
