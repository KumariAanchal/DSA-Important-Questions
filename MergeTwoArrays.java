class Solution
{
    //Function to merge the arrays.
    public static void merge(long a[], long b[], int n, int m) 
    {
        // code here
        int i=n-1,j=0;
        while(i>=0 && j<m){
            if(a[i]>b[j]){
                long temp=a[i];
                a[i]=b[j];
                b[j]=temp;
                i--;
                j++;
            }
            else{
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
