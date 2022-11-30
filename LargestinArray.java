//This program returns the index of the largest element.
public class LargestinArray {
    public static void main(String[] args){
        int arr1[] = {3, 8, 12, 5, 6};
        System.out.println(GetLargest(arr1));
    }
    public static int GetLargest( int arr[]){
        int res=0;
        for(int i=1; i<arr.length; i++){
            if (arr[i]>arr[res])
                res=i;
        }
        return res;
    }
}
