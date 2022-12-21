public class PrefixSum {
    public static int getSum(int ps[], int l, int r){
        
        if(l==0)
            return ps[r];
            
        return ps[r]-ps[l-1];
        
    }
    public static void main(String args[]) 
        { 
            int arr[]={2, 8, 3, 9, 6, 5, 4};
            
            int n=7;
            
            int ps[];
            ps = new int[n];
            
            ps[0] = arr[0];
            
            for(int i=1; i<n; i++)
                ps[i] = ps[i-1]+ arr[i];
                
           System.out.println(getSum(ps, 1, 3));
        } 
}
