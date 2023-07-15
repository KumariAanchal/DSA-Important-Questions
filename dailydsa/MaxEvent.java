class Solution {
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events,Comparator.comparingDouble(o->o[0]));
        int dp[][]= new int[k+1][events.length+1];
        return helper(events,k,0,dp);
    }
    int helper(int [][]eve,int k,int i,int dp[][]){
        if(i>=eve.length ||k<=0) return 0;
        if(dp[k][i]!=0) return dp[k][i];
        int skip=helper(eve,k,i+1,dp);
        int val=eve[i][2];
        int j=i+1;
        for(;j<eve.length;j++){
            if(eve[j][0]>eve[i][1]) break;
        }
        int take=val+helper(eve,k-1,j,dp);
        return dp[k][i]=Math.max(skip,take);
    }
}
