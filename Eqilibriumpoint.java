public class Eqilibriumpoint {
    public static boolean ePoint(int arr[]){
        int n= arr.length;
        int rs=0;
        for (int i=0; i<n; i++){
            rs+=arr[i];
        }
        int ls=0;
        for(int i=0; i<n; i++){
            rs-=arr[i];
            if(ls==rs)
                return true;
            ls+=arr[i];
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={3,4,8,-9,9,7};
        System.out.println(ePoint(arr));
    }
}
