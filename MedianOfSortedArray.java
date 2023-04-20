class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer>a1=new ArrayList<>();
        double e=0;
        double f=0;
        double h=0;
        for(int c:nums1){
            a1.add(c);
        }
        for(int d:nums2){
            a1.add(d);
        }
        Collections.sort(a1);
        int m=a1.size();
        int z=m/2;
        if(m%2!=0){
           e=a1.get(z);
           return e; 
        }
        else{
            e=a1.get(z);
            f=a1.get(z-1);
            h=((e+f)/2);
            return (double)h;
        }
    }
}
