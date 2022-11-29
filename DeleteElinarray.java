//This delete operation is going to delete only the first occourance of this element return the new size of the array.
public class DeleteElinarray {
    public static void main(String[] args){
        int arr[] = {3, 8, 12, 5, 6}, x = 12, n = 5;
       System.out.println("Before Deletion");
       for(int i=0; i < n; i++){
       		System.out.print(arr[i]+" ");
       }
       System.out.println();
       n = delel(arr, n, x);
       System.out.println("After Deletion");
       for(int i=0; i < n; i++){
       		System.out.print(arr[i]+" ");
       }
    } 
    public static int delel(int arr[], int n, int x){
        int i;
        for(i=0; i<n; i++){
            if(arr[i]==x)
               break;
        }
        if (i==n)
           return n;
        for (int j=i; j<n-1; j++){
            arr[j]=arr[j+1];
        }
        return (n-1);
    }
}
