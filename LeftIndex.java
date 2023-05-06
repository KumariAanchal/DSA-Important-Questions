class LeftIndex{ 

    static int leftIndex(int N, int arr[], int x)
    {
       // Your code here
       int high=N-1;
       int low=0;
       return FirstOcc(arr,low,high,x);
    }
    static int FirstOcc(int arr[], int low, int high, int x){
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(x>arr[mid])
            return FirstOcc(arr, mid+1, high, x);
        else if(x<arr[mid]){
            return FirstOcc(arr, low, mid-1, x);
        }
        else{
            if(mid==0 || arr[mid-1]!=arr[mid])
                return mid;
            else
                return FirstOcc(arr, low, mid-1, x);
        }
    }
}
