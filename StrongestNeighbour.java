// Given an array arr[] of n positive integers. The task is to find the maximum for every adjacent pairs in the array.
public class StrongestNeighbour {
    static void maximumAdjacent(int n, int arr[]){
        for(int i = 0; i< n-1; i++){
            System.out.print((arr[i] > arr[i+1] ? arr[i] : arr[i+1]) +" ");
       }
   }
   public static void main(String args[]){
    int arr[]={1,2,2,3,4,5};
    int n=arr.length;
    maximumAdjacent(n, arr);
}
}
