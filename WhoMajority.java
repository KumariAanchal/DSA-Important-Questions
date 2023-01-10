public class WhoMajority {
    public static int majorityWins(int arr[], int n, int x, int y) {
        int countx=0,county=0;
       for(int i=0;i<n;i++){
           if(arr[i]==x)
           countx++;
           else if(arr[i]==y)
           county++;
       }
       
       if(countx==county)
           return Math.min(x,y);
       else if(countx>county)
           return x;
       else
           return y;// code here
    } 
    public static void main(String args[]){
        int arr[]={1,1,2,2,3,3,4,4,4,4,5};
        int n=arr.length;
        int x=4;
        int y=5;
        System.out.println(majorityWins(arr, n, x, y));
    }
}
