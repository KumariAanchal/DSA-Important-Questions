 public static void sort012(int a[], int n)
    {
        // code here 
        int L=0, M=0, R = n-1;
        while(M<=R){
            if(a[M]==0){
                int temp = a[L];
                a[L] = a[M];
                a[M] = temp;
                L++;
            }
            
            if(a[M]==2){
                int temp = a[R];
                a[R] = a[M];
                a[M] = temp;
                R--;
            }
            else{
                M++;
            }
        }
    }
