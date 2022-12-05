public class LeftRotate {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        rorleftby1(arr);
        for (int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
    }
    public static void rorleftby1(int arr[]){
        int n =arr.length;
        int temp=arr[0];
        for(int i=1; i<n; i++)
            arr[i-1]=arr[i];
        arr[n-1]=temp;
    }
}
