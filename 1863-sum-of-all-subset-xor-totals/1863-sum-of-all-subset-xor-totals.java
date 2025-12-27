class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums,0,0);
    }
    public int helper(int[] nums,int idx,int sum){
        if(idx==nums.length){
            return sum;
        }
        //include
        int a=helper(nums,idx+1,sum^nums[idx]);
        //dont include
         int b=helper(nums,idx+1,sum);
         return a+b;


    }
}