public class sumsubarraydivbyk {
    public static int subarraysDivByK(int[] nums, int k) {
        int ans = 0;
        int prefix = 0;
        int[] count = new int[k];
        count[0] = 1;
        for (int a : nums) {
        prefix = (prefix + a % k + k) % k;
        ans += count[prefix];
        ++count[prefix];
        }
        return ans;
    }
    public static void main(String args[]){
        int[] arr={4,5,0,-2,-3,1};
        int k=5;
        System.out.println(subarraysDivByK(arr, k));
    }
}
