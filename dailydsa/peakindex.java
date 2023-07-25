class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peak=0;
        int ele=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>peak){
                peak=arr[i];
                ele=i;
            }
        }
        return ele;
    }
}
