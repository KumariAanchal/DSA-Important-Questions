//This program finds index of 2nd largest element in an array in theta(n) time.
public class SecondLargeElement {
    public static void main(String[] args){
        int arr1[] = {5, 20, 12, 20, 8};
        System.out.println(getseclar(arr1));
    }
    public static int getseclar(int arr[]){
        int n= arr.length;
        int res=-1;
        int lar=0;
        for(int i=1; i<n;i++){
            if(arr[i]>arr[lar]){
                res=lar;
                lar=i;
            }
            else if (arr[i]!=arr[lar]){
                if(res==-1 || arr[i]>arr[res])
                      res=i;
            }
        }
        return res;
    }

}
