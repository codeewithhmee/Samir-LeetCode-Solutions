class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums,0,0);
    }
    public int helper(int[] nums,int idx,int sum){
        if(idx==nums.length)return sum;
        return helper(nums,idx+1,sum^nums[idx])+helper(nums,idx+1,sum);
    }
}