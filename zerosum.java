class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
         HashMap<Long,Integer>map=new HashMap<>();
        int i=-1;
        long sum=0;
        int count=0;
        map.put(0L,1);
        while(i<arr.length-1){
            i++;
            sum+=arr[(int)i];
            if(map.containsKey(sum)){
                count+=map.get(sum);
                map.put(sum, map.get(sum) + 1);
            }
            else{
                map.put(sum,1);
            }
        }
        return count;
    }
}
