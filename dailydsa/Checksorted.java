// Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.Input: nums = [3,4,5,1,2] Output: true
class Solution {
    public boolean check(int[] nums) {
        int n=nums.length, k=0;
        for(int i=0;i<n; i++){
            if(nums[i]>nums[(i+1)%n]){   //3%5=3
                k++;
            }if(k>1){
                return false;
            }
        }
        return true;
    }
}

