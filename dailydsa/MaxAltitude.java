class Solution {
    public int largestAltitude(int[] gain) {
        int maxal=0;
        int curral=0;
        for(int i=0; i<gain.length; i++){
            curral+=gain[i];
            maxal=Math.max(maxal, curral);
        }
        return maxal;
    }
}
