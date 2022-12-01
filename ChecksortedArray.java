// This program checks if the given array is sorted or not (non decreasing order only). Time complexity is Big O(n).
public class ChecksortedArray {
    public static void main(String[] args){
        int arr1[] = {3, 8, 12, 5, 6};
        System.out.println(sortOrnot(arr1));
        int arr2[] = {3, 5, 8, 12, 26};
        System.out.println(sortOrnot(arr2));
    }
    public static boolean sortOrnot (int arr[]){
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1])
                 return false;
        }
        return true;
    }
}
