//This program reverse the given array in theta(n) time and in auxilary space theta(1).
public class ReverseArray {
    public static void main(String[] args){
        int arr1[] ={5, 20, 6, 8, 12};
        reverse(arr1);
        System.out.println("After Reverse");
        int n = arr1.length;
       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr1[i]+" ");
       }
    }

    public static void reverse(int arr[]){
        int n = arr.length;
        int low=0;
        int high=n-1;
        while(low<high){
            int temp= arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
}
