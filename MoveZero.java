//Thie program move all zero to the end. Time complexity O(n) and Auxilary Space O(1).
public class MoveZero {
    public static void main(String[] args){
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        movzero(arr);
        for (int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
    public static void movzero(int arr[]){
        int n=arr.length;
        int count= 0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0)
            arr[count++] = arr[i];
        }
        while (count < n)
			arr[count++] = 0;
    }
}
